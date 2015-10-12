package es.upm.miw.iwvg.doo.controllers.interfaces;

public interface MoveFromGroupToGroup {
    public boolean canMove(int originIndex, int destinationIndex, int numberOfCards);

    public void move(int originIndex, int destinationIndex, int numberOfCards);

    public int getNumberOfCardsInOrigin(int originIndex);
}
