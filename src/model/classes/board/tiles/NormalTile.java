package model.classes.board.tiles;

import model.classes.game.GameManagerModel;
import model.classes.players.Player;

import java.util.List;

public class NormalTile extends Tile {

    public NormalTile(String tileName, short tileNumber, List<Player> playersOnTile) {
        super(tileName, tileNumber, playersOnTile);
    }

    @Override
    public void TriggerTileAction(GameManagerModel gameReference) {
        System.out.println("...");
    }
}
