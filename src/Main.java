import controller.GameManagerController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GameManagerController gameManagerController = new GameManagerController();
        gameManagerController.run();
    }
}