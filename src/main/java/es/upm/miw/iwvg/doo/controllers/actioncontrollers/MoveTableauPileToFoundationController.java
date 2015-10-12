package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.interfaces.MoveFromGroupToGroup;
import es.upm.miw.iwvg.doo.models.Game;

public class MoveTableauPileToFoundationController extends MoveController implements MoveFromGroupToGroup {

    public MoveTableauPileToFoundationController(Game game) {
        super(game);
    }

    @Override
    public boolean canMove(int originIndex, int destinationIndex, int numberOfCards) {
        return this.game.canMove(this.game.getTableauByIndex(originIndex), this.game.getFoundationByIndex(destinationIndex), numberOfCards);
    }

    @Override
    public void move(int originIndex, int destinationIndex, int numberOfCards) {
        this.game.move(this.game.getTableauByIndex(originIndex), this.game.getFoundationByIndex(destinationIndex), numberOfCards);
    }

    @Override
    public int getNumberOfCardsInOrigin(int originIndex) {
        return this.game.getTableauByIndex(originIndex).stackSize();
    }
}
