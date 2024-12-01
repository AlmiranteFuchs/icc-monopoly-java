package model.classes.cards;

public abstract class Card {
    protected String _cardName;
    public String get_cardName() { return _cardName; }
    public void set_cardName(String _cardName) { this._cardName = _cardName; }

    protected String _description;
    public String get_description() { return _description; }
    public void set_description(String _description) { this._description = _description; }

    public abstract void CardAction();
}
