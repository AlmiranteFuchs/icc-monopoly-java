package model.classes.board;

import model.classes.board.tiles.Tile;
import model.classes.factory.TileFactory;
import model.classes.players.Player;

import java.util.List;

public class Board {
    private List<Tile> _boardTiles;
    public List<Tile> get_boardTiles() { return _boardTiles; }
    public void set_boardTiles(List<Tile> _boardTiles) { this._boardTiles = _boardTiles; }


    public Board() {
        this._boardTiles = TileFactory.CreateBoardTiles();
    }

    public Tile FindTileOfPlayer(Player player){
        for (Tile tile : _boardTiles) {
            if (tile.get_playersOnTile().contains(player)) {
                return tile;
            }
        }
        return null;
    }
}

