package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveWasteToDeckController;
import es.upm.miw.iwvg.doo.util.IO;

public class MoveWasteToDeckView extends View {

    private MoveWasteToDeckController moveWasteToDeckController;

    public MoveWasteToDeckView(MoveWasteToDeckController moveWasteToDeckController) {
        this.moveWasteToDeckController = moveWasteToDeckController;
    }

    @Override
    public void render() {
        IO io = new IO();
        io.writeln("Se mueve de descarte a baraja");
        if (this.moveWasteToDeckController.canMove()) {
            this.moveWasteToDeckController.move();
        } else {
            io.writeln("ERROR!!! No quedan más cartas en el área de descarte");
        }
    }
}
