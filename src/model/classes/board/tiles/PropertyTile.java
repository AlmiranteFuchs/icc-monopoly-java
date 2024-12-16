package model.classes.board.tiles;

import model.classes.game.GameManagerModel;
import model.classes.players.Player;
import model.classes.properties.Property;

import java.util.List;

public class PropertyTile extends Tile {
    public Property property;

    public PropertyTile(String tileName, short tileNumber, List<Player> playersOnTile, Property property) {
        super(tileName, tileNumber, playersOnTile);
        this.property = property;
    }

    @Override
    public void TriggerTileAction(GameManagerModel gameReference) {
        System.out.println(gameReference.get_currentPlayer().get_name() + " on property " + this.property._propertyName);
    }
}
