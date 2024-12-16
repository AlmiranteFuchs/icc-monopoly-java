package controller;

import model.classes.game.GameManagerModel;
import model.classes.players.Player;
import model.utils.DiceHelper;
import model.utils.WaitHelper;
import view.GameManagerView;

import java.io.IOException;

public class GameManagerController {
    // This is public for good reasons, everything inside is controlled via get, set...
    private GameManagerModel gameManager;
    private GameManagerView view;

    // Singleton reference
    public GameManagerController() throws IOException {
        this.gameManager = GameManagerModel.getInstance();
        this.view = new GameManagerView();
    }

    // Method to move a player by a certain number of tiles
    public void movePlayer(Player player, int times) {
        gameManager.TraversePlayerToTile(times, player);
    }

    // Method to get the current state of the board
    public String getBoardState() {
        return gameManager.toString();
    }

    public void run() {
        int temp_limit = 0;

        while (true) {
            temp_limit++;
            Player local_player = gameManager.get_currentPlayer();

            view.showTextForTime("Vez de: " + local_player.get_name());
            view.waitForKeyPress();

            view.showTextForTime("Pressione qualquer tecla para rolar os dados...");
            view.waitForKeyPress();

            int local_roll = DiceHelper.rollDices();
            view.showTextForTime("Rolou: " + local_roll);
            view.waitForKeyPress();

            gameManager.TraversePlayerToTile(local_roll, local_player);
            gameManager.NextPlayerTurn(local_player);

            if (temp_limit == 7) {
                System.out.println("Fim das rodadas");
                break;
            }
        }

        System.out.println("Out");
    }
}
