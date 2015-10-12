package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.GameActionController;
import es.upm.miw.iwvg.doo.models.Game;

public abstract class MoveController extends GameActionController {

    public MoveController(Game game) {
        super(game);
    }
}
