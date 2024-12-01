package model.classes.board.tiles.normalTile;

import model.classes.board.tiles.Tile;

public class NormalTile extends Tile {
    public NormalTile(String tileName, short tileNumber) {
        super();
        this._tileNumber = tileNumber;
        this._tileName = tileName;
    }

    @Override
    public void TriggerTileAction() {
        // TODO: Options to buy stuff
    }
}
