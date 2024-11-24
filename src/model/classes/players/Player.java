package model.classes.players;

import model.classes.cards.Card;

import java.util.List;

public class Player extends Person {
    private List<Card> _holdingChanceCards = List.of();
    private List<Card> _propertyCards = List.of();

    public Player(String name) {
        super(name);
    }
}
