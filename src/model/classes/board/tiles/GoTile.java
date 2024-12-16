package model.classes.board.tiles;

import model.classes.game.GameManagerModel;
import model.classes.players.Player;

import java.util.List;

public class GoTile extends Tile {
    public GoTile(String tileName, short tileNumber, List<Player> playersOnTile) {
        super(tileName, tileNumber, playersOnTile);
    }

    @Override
    public void TriggerTileAction(GameManagerModel gameReference) {
        // Give $200 to player on the tile
        System.out.println("Go! $200 para: " + gameReference.get_currentPlayer().get_name());
        gameReference.get_currentPlayer().Deposit(200);
    }
}
