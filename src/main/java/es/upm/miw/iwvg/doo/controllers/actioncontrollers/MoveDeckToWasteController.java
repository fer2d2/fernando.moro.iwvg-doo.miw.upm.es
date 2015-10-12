package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.interfaces.MoveFromCardStackToCardStack;
import es.upm.miw.iwvg.doo.models.Game;

public class MoveDeckToWasteController extends MoveController implements MoveFromCardStackToCardStack {

    public MoveDeckToWasteController(Game game) {
        super(game);
    }

    @Override
    public boolean canMove() {
        return this.game.getDeck().hasCards();
    }

    @Override
    public void move() {
        this.game.move(this.game.getDeck(), this.game.getWaste());
    }
}
