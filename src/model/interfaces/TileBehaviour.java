package model.interfaces;

import model.classes.game.GameManagerModel;
import model.classes.players.Player;

public interface TileBehaviour {
    void TriggerTileAction(GameManagerModel gameReference);
}
