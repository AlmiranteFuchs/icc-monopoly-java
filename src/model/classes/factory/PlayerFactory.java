package model.classes.factory;

import model.classes.players.Player;

import java.util.List;

public class PlayerFactory {
    public static List<Player> CreateGamePlayers() {
        Player player1 = new Player("Marcela");
        Player player2 = new Player("Manuela");
        Player player3 = new Player("Efiye");
        Player player4 = new Player("John Pork");

        return List.of(player1, player2, player3, player4);
    }
}