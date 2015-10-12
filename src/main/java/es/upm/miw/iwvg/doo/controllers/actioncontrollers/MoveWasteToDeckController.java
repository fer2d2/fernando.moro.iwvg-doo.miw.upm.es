package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.interfaces.MoveFromCardStackToCardStack;
import es.upm.miw.iwvg.doo.models.Game;

public class MoveWasteToDeckController extends MoveController implements MoveFromCardStackToCardStack {

    public MoveWasteToDeckController(Game game) {
        super(game);
    }

    @Override
    public boolean canMove() {
        return this.game.canMove(this.game.getWaste(), this.game.getDeck());
    }

    @Override
    public void move() {
        this.game.move(this.game.getWaste(), this.game.getDeck());
    }
}
