package model.classes.game;

import model.classes.board.Board;
import model.classes.factory.PlayerFactory;
import model.classes.players.Player;

import java.util.List;

public class GameManagerModel {
    private List<Player> _players = List.of();
    private Player _currentPlayer;
    private Board _board;

    public GameManagerModel() {
        this._players = PlayerFactory.CreateGamePlayers();
    }

    public TraverseCurrentPlayerToTile(short tileNumber){

    }
    public MoveCurrentPlayerToTile(short tileNumber){

    }
}
