package es.upm.miw.iwvg.doo.controllers.interfaces;

public interface MoveFromCardStackToGroup {

    public boolean canMove(int foundationIndex);

    public void move(int foundationIndex);
}
