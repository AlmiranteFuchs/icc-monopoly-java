package model.classes.factory;

import model.classes.players.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerFactory {
    public static List<Player> CreateGamePlayers() {
        Player player1 = new Player("Marcela");
        Player player2 = new Player("Manuela");
        Player player3 = new Player("Efiye");
        Player player4 = new Player("John Pork");

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        return players;
    }
}
