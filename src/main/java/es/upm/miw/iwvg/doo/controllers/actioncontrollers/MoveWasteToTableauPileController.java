package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.interfaces.MoveFromCardStackToGroup;
import es.upm.miw.iwvg.doo.models.Game;

public class MoveWasteToTableauPileController extends MoveController implements MoveFromCardStackToGroup {

    public MoveWasteToTableauPileController(Game game) {
        super(game);
    }

    @Override
    public boolean canMove(int tableauIndex) {
        return this.game.canMove(this.game.getWaste(), this.game.getTableauByIndex(tableauIndex));
    }

    @Override
    public void move(int tableauIndex) {
        this.game.move(this.game.getWaste(), this.game.getTableauByIndex(tableauIndex));
    }
}
