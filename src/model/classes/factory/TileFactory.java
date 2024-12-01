package model.classes.factory;

import model.classes.board.tiles.Tile;
import model.classes.board.tiles.normalTile.NormalTile;

import java.util.List;

public class TileFactory {
    // Creates the game specified tiles
    public static List<Tile> CreateBoardTiles() {
        Tile tile1 = new NormalTile("Tile 1", (short) 1);
        Tile tile2 = new NormalTile("Tile 2", (short) 2);
        Tile tile3 = new NormalTile("Tile 3", (short) 3);
        Tile tile4 = new NormalTile("Tile 4", (short) 4);
        Tile tile5 = new NormalTile("Tile 5", (short) 5);

        return List.of(tile1, tile2, tile3, tile4, tile5);
    }
}
