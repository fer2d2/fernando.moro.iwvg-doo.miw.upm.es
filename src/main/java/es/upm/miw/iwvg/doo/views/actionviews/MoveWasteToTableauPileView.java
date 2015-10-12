package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveWasteToTableauPileController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.util.IO;

public class MoveWasteToTableauPileView extends View {

    private MoveWasteToTableauPileController moveWasteToTableauPileController;

    public MoveWasteToTableauPileView(MoveWasteToTableauPileController moveWasteToTableauPileController) {
        this.moveWasteToTableauPileController = moveWasteToTableauPileController;
    }

    @Override
    public void render() {
        IO io = new IO();

        int chosenOption = this.askForOption("Seleccione la escalera", Game.MAX_TABLEAUS);

        io.writeln("Se mueve de descarte a escalera");
        if (this.moveWasteToTableauPileController.canMove(chosenOption - 1)) {
            this.moveWasteToTableauPileController.move(chosenOption - 1);
        } else {
            io.writeln("ERROR!!! No se puede llevar a cabo ese movimiento");
        }
    }
}
