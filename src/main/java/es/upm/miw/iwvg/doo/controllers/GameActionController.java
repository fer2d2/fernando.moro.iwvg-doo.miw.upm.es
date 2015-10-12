package es.upm.miw.iwvg.doo.controllers;

import es.upm.miw.iwvg.doo.controllers.interfaces.Controller;
import es.upm.miw.iwvg.doo.models.Game;

public abstract class GameActionController implements Controller {

    protected Game game;

    public GameActionController(Game game) {
        this.game = game;
    }
}
