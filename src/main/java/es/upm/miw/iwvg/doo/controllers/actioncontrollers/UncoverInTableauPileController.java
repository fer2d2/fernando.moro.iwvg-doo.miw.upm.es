package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.GameActionController;
import es.upm.miw.iwvg.doo.models.Game;

public class UncoverInTableauPileController extends GameActionController {

    public UncoverInTableauPileController(Game game) {
        super(game);
    }

    public boolean canUncover(int tableauIndex) {
        return this.game.canUncoverLastCardInTableau(tableauIndex);
    }

    public void uncover(int tableauIndex) {
        this.game.uncoverLastCardInTableau(tableauIndex);
    }
}
