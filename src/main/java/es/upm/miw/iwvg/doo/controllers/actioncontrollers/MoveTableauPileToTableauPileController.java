package es.upm.miw.iwvg.doo.controllers.actioncontrollers;

import es.upm.miw.iwvg.doo.controllers.interfaces.MoveFromGroupToGroup;
import es.upm.miw.iwvg.doo.models.Game;

public class MoveTableauPileToTableauPileController extends MoveController implements MoveFromGroupToGroup {

    public MoveTableauPileToTableauPileController(Game game) {
        super(game);
    }

    @Override
    public boolean canMove(int originTableauIndex, int destinationTableauIndex, int numberOfCards) {
        return this.game.canMove(this.game.getTableauByIndex(originTableauIndex), this.game.getTableauByIndex(destinationTableauIndex),
                numberOfCards);
    }

    @Override
    public void move(int originTableauIndex, int destinationTableauIndex, int numberOfCards) {
        this.game.move(this.game.getTableauByIndex(originTableauIndex), this.game.getTableauByIndex(destinationTableauIndex),
                numberOfCards);
    }

    @Override
    public int getNumberOfCardsInOrigin(int originIndex) {
        return this.game.getTableauByIndex(originIndex).stackSize();
    }
}
