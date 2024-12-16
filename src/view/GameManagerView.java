package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class GameManagerView extends JFrame {
    private Image image;
    private boolean keyPressed = false;
    private JLabel imageLabel;
    private String imagePath = "src/resources/printable-monopoly-game-board-template_10316.jpg";
    private JLabel textLabel; // Label to display text temporarily
    private CustomPanel customPanel;

    public GameManagerView() throws IOException {
        // Load the image from the file
        image = ImageIO.read(new File(imagePath));

        // Initialize the JLabel to display the image
        imageLabel = new JLabel(new ImageIcon(image));

        // Set up the JFrame
        setTitle("Dynamic Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); // Default window size
        setVisible(true);
        setLayout(new BorderLayout());

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);

        customPanel = new CustomPanel();
        customPanel.setBounds(0, 0, getWidth(), getHeight());

        imageLabel.setBounds(0, 0, getWidth(), getHeight());
        layeredPane.add(imageLabel, JLayeredPane.PALETTE_LAYER);

        textLabel = new JLabel("", SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 40));
        textLabel.setForeground(Color.BLACK );
        textLabel.setBounds(0, 0, getWidth(), getHeight());
        layeredPane.add(textLabel, JLayeredPane.POPUP_LAYER);


        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resizeImageToWindow();
                customPanel.setBounds(0, 0, getWidth(), getHeight()); // Resize the custom panel to match the window
                imageLabel.setBounds(0, 0, getWidth(), getHeight()); // Resize the image
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                synchronized (GameManagerView.this) {
                    keyPressed = true; // Mark key press as detected
                    GameManagerView.this.notify(); // Notify waiting threads
                }
            }
        });

        add(layeredPane, BorderLayout.CENTER);
        setFocusable(true);
        requestFocusInWindow();

        drawTextAtCoordinates("Fuck", getWidth()/2, getHeight()/2);


    }

    public void drawTextAtCoordinates(String text, int x, int y) {
        customPanel.setTextToDraw(text, x, y); // Set text and coordinates
        repaint(); // Trigger the repaint to draw text
    }

    private class CustomPanel extends JPanel {
        private String textToDraw = "AAAAAaaaaA";
        private int textX = 0;
        private int textY = 0;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (!textToDraw.isEmpty()) {
                // Set font and color for the text
                g.setFont(new Font("Arial", Font.BOLD, 40));
                g.setColor(Color.BLACK);
                g.drawString(textToDraw, textX, textY); // Draw the text at specified coordinates
            }
        }

        public void setTextToDraw(String text, int x, int y) {
            this.textToDraw = text;
            this.textX = x;
            this.textY = y;
        }
    }

    private void resizeImageToWindow() {
        int windowWidth = getWidth();
        int windowHeight = getHeight();

        Image scaledImage = image.getScaledInstance(windowWidth, windowHeight, Image.SCALE_SMOOTH);

        imageLabel.setIcon(new ImageIcon(scaledImage));
    }

    public void waitForKeyPress() {
        synchronized (this) {
            while (!keyPressed) {
                try {
                    wait(); // Wait until key press is detected
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
            keyPressed = false; // Reset for next key press
        }
    }

    public void showTextForTime(String text) {
        // Set the text and make the label visible
        textLabel.setText(text);
        textLabel.setVisible(true);

        // Create a timer to hide the text after the specified time
    }
}
