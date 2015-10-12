package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.interfaces.MoveFromGroupToGroup;
import es.upm.miw.iwvg.doo.models.Game;

public class MoveFoundationToTableauPileController extends MoveController implements MoveFromGroupToGroup {

    public MoveFoundationToTableauPileController(Game game) {
        super(game);
    }

    @Override
    public boolean canMove(int originIndex, int destinationIndex, int numberOfCards) {
        return this.game.canMove(this.game.getFoundationByIndex(originIndex), this.game.getTableauByIndex(destinationIndex), numberOfCards);
    }

    @Override
    public void move(int originIndex, int destinationIndex, int numberOfCards) {
        this.game.move(this.game.getFoundationByIndex(originIndex), this.game.getTableauByIndex(destinationIndex), numberOfCards);
    }

    @Override
    public int getNumberOfCardsInOrigin(int originIndex) {
        return this.game.getFoundationByIndex(originIndex).stackSize();
    }
}
