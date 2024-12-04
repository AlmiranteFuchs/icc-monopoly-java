package view;

import controller.GameManagerController;
import model.classes.players.Player;

import java.util.Scanner;

public class GameManagerView {
    private final GameManagerController controller;

    public GameManagerView() {
        this.controller = new GameManagerController();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Game!");
        System.out.println("Initial board state:");
        System.out.println(controller.getBoardState());


        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Move Player 1");
            System.out.println("2. Move Player 2");
            System.out.println("3. View Board State");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter number of tiles to move Player 1:");
                    int tiles = scanner.nextInt();
                    controller.movePlayer(controller.gameManager.get_players().get(0), tiles);
                }
                case 2 -> {
                    System.out.println("Enter number of tiles to move Player 2:");
                    int tiles = scanner.nextInt();
                    controller.movePlayer(controller.gameManager.get_players().get(1), tiles);
                }
                case 3 -> System.out.println(controller.getBoardState());
                case 4 -> {
                    System.out.println("Exiting the game. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }

            System.out.println("\nUpdated board state:");
            System.out.println(controller.getBoardState());
        }
    }
}
