package model.classes.board.tiles;

import model.classes.players.Player;
import model.interfaces.TileBehaviour;

import java.util.List;

public abstract class Tile implements TileBehaviour {
    protected short _tileNumber;
    protected String _tileName;
    protected List<Player> _playersOnTile;

    public short get_tileNumber() { return _tileNumber; }
    public void set_tileNumber(short _tileNumber) { this._tileNumber = _tileNumber; }

    public String get_tileName() { return _tileName; }
    public void set_tileName(String _tileName) { this._tileName = _tileName; }

    public List<Player> get_playersOnTile() { return _playersOnTile; }
    public void set_playersOnTile(List<Player> _playersOnTile) { this._playersOnTile = _playersOnTile; }

}

