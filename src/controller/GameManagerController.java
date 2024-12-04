package controller;

import model.classes.game.GameManagerModel;
import model.classes.players.Player;

public class GameManagerController {
    // This is public for good reasons, everything inside is controlled via get, set...
    public final GameManagerModel gameManager;

    public GameManagerController() {
        this.gameManager = new GameManagerModel();
    }

    // Method to move a player by a certain number of tiles
    public void movePlayer(Player player, int times) {
        gameManager.TraversePlayerToTile(times, player);
    }

    // Method to get the current state of the board
    public String getBoardState() {
        return gameManager.toString();
    }
}
