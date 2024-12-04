package model.classes.board.tiles.normalTile;

import model.classes.board.tiles.Tile;

import java.util.ArrayList;

public class NormalTile extends Tile {
    public NormalTile(String tileName, short tileNumber) {
        super();
        this._tileNumber = tileNumber;
        this._tileName = tileName;
        this._playersOnTile = new ArrayList<>();
    }

    @Override
    public void TriggerTileAction() {
        // TODO: Options to buy stuff
    }
}
