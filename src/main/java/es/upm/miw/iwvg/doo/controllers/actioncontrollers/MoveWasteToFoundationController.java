package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.interfaces.MoveFromCardStackToGroup;
import es.upm.miw.iwvg.doo.models.Game;

public class MoveWasteToFoundationController extends MoveController implements MoveFromCardStackToGroup {

    public MoveWasteToFoundationController(Game game) {
        super(game);
    }

    @Override
    public boolean canMove(int foundationIndex) {
        return this.game.canMove(this.game.getWaste(), this.game.getFoundationByIndex(foundationIndex));
    }

    @Override
    public void move(int foundationIndex) {
        this.game.move(this.game.getWaste(), this.game.getFoundationByIndex(foundationIndex));
    }
}
