package model.classes.players;

import model.classes.board.tiles.Tile;
import model.classes.cards.Card;

import java.util.List;

public class Player extends Person {
    private List<Card> _holdingChanceCards = List.of();
    private List<Card> _propertyCards = List.of();
    private Tile _currentTile;


    public List<Card> get_holdingChanceCards() { return _holdingChanceCards; }
    public void set_holdingChanceCards(List<Card> _holdingChanceCards) { this._holdingChanceCards = _holdingChanceCards; }

    public List<Card> get_propertyCards() { return _propertyCards; }
    public void set_propertyCards(List<Card> _propertyCards) { this._propertyCards = _propertyCards; }

    public Tile get_currentTile() { return _currentTile; }
    public void set_currentTile(Tile _currentTile) { this._currentTile = _currentTile; }


    public Player(String name) {
        super(name);
    }
}
