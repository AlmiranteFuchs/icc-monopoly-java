package model.classes.game;

import model.classes.board.Board;
import model.classes.board.tiles.Tile;
import model.classes.factory.PlayerFactory;
import model.classes.players.Player;

import java.util.List;

public class GameManagerModel {
    private List<Player> _players = List.of();
    public List<Player> get_players() { return _players; }

    private Player _currentPlayer;
    public Player get_currentPlayer() { return _currentPlayer; }
    public void set_currentPlayer(Player _currentPlayer) { this._currentPlayer = _currentPlayer; }

    private Board _board;
    public Board get_board() { return _board; }


    public GameManagerModel() {
        this._players = PlayerFactory.CreateGamePlayers();
        this._board = new Board();

        // Set players on board on first Tile
        this._board.get_boardTiles().getFirst().set_playersOnTile(_players);
    }

    public void TraversePlayerToTile(int times, Player player) {
        for (int i = 0; i < times; i++) {
            MovePlayerToNextTile(player);
        }
    }

    public void MovePlayerToNextTile(Player player) {
        List<Tile> boardTiles = _board.get_boardTiles();

        // Find Player on board
        // // Find optimization but no time to thinkl
        Tile tileWithPlayer = boardTiles
                .stream()
                .filter(tile -> tile.get_playersOnTile().contains(player))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Player not found on any tile"));

        // Removes player on that tile
        tileWithPlayer.get_playersOnTile().remove(player);

        // Next Tile
        int nextIndex = (tileWithPlayer.get_tileNumber() + 1) % boardTiles.size();
        Tile destinationTile = boardTiles.get(nextIndex);

        // Add player to that tile
        destinationTile.get_playersOnTile().add(player);
    }
}
