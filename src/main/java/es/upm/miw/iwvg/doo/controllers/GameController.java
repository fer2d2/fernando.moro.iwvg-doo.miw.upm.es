package es.upm.miw.iwvg.doo.controllers;

import es.upm.miw.iwvg.doo.models.Foundation;
import es.upm.miw.iwvg.doo.models.Game;

public class GameController extends GameActionController {

    public GameController(Game game) {
        super(game);
    }

    public boolean isGameOver() {
        for (Foundation foundation : this.game.getFoundations()) {
            if (!foundation.isComplete()) {
                return false;
            }
        }
        return true;
    }

    public Game getGame() {
        return game;
    }
}
