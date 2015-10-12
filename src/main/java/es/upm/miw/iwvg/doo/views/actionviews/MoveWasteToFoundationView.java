package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveWasteToFoundationController;
import es.upm.miw.iwvg.doo.models.Suit;
import es.upm.miw.iwvg.doo.util.IO;

public class MoveWasteToFoundationView extends View {

    private MoveWasteToFoundationController moveWasteToFoundationController;

    public MoveWasteToFoundationView(MoveWasteToFoundationController moveWasteToFoundationController) {
        this.moveWasteToFoundationController = moveWasteToFoundationController;
    }

    @Override
    public void render() {
        IO io = new IO();

        int chosenOption = this.askForOption("Seleccione el palo", Suit.values().length);

        io.writeln("Se mueve de descarte a palo");
        if (this.moveWasteToFoundationController.canMove(chosenOption - 1)) {
            this.moveWasteToFoundationController.move(chosenOption - 1);
        } else {
            io.writeln("ERROR!!! No se puede llevar a cabo ese movimiento");
        }
    }

}
