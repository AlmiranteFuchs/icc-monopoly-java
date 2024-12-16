package model.classes.factory;

import model.classes.board.tiles.PropertyTile;
import model.classes.board.tiles.Tile;
import model.classes.board.tiles.GoTile;
import model.classes.board.tiles.NormalTile;

import java.util.ArrayList;
import java.util.List;

public class TileFactory {
    // Creates the game specified tiles
    public static List<Tile> CreateBoardTiles() {
        List<Tile> boardTiles = new ArrayList<>();

        boardTiles.add(new GoTile("Go tile", (short) 1, new ArrayList<>()));
        boardTiles.add(new PropertyTile("Property 1", (short) 2, new ArrayList<>(), PropertyFactory.getPropertyByIndex(0)));
        boardTiles.add(new NormalTile("Placeholder 1", (short) 3, new ArrayList<>()));
        boardTiles.add(new PropertyTile("Property 2", (short) 4, new ArrayList<>(), PropertyFactory.getPropertyByIndex(1)));
        boardTiles.add(new PropertyTile("Property 3", (short) 5, new ArrayList<>(), PropertyFactory.getPropertyByIndex(2)));
        boardTiles.add(new PropertyTile("Property 4", (short) 7, new ArrayList<>(), PropertyFactory.getPropertyByIndex(3)));
        boardTiles.add(new NormalTile("Placeholder 3", (short) 8, new ArrayList<>()));
        boardTiles.add(new PropertyTile("Property 5", (short) 9, new ArrayList<>(), PropertyFactory.getPropertyByIndex(4)));
        boardTiles.add(new PropertyTile("Property 6", (short) 10, new ArrayList<>(), PropertyFactory.getPropertyByIndex(5)));


        return boardTiles;
    }
}
