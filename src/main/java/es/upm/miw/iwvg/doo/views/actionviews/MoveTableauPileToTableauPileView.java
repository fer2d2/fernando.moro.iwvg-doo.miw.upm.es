package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveTableauPileToTableauPileController;
import es.upm.miw.iwvg.doo.util.IO;

public class MoveTableauPileToTableauPileView extends View {

    private MoveTableauPileToTableauPileController moveTableauPileToTableauPileController;

    public MoveTableauPileToTableauPileView(MoveTableauPileToTableauPileController moveTableauPileToTableauPileController) {
        this.moveTableauPileToTableauPileController = moveTableauPileToTableauPileController;
    }

    @Override
    public void render() {
        IO io = new IO();

        int chosenTableauOrigin = this.askForOption("Seleccione la escalera de origen", 7);
        int chosenTableauDestination = this.askForOption("Seleccione la escalera de destino", 7);
        int chosenNumberOfCards = this.askForOption("Seleccione el numero de cartas",
                this.moveTableauPileToTableauPileController.getNumberOfCardsInOrigin(chosenTableauOrigin));

        io.writeln("Se mueve de palo a escalera");
        if (this.moveTableauPileToTableauPileController.canMove(chosenTableauOrigin - 1, chosenTableauDestination - 1,
                chosenNumberOfCards)) {
            this.moveTableauPileToTableauPileController.move(chosenTableauOrigin - 1, chosenTableauDestination - 1, chosenNumberOfCards);
        } else {
            io.writeln("ERROR!!! No se puede llevar a cabo ese movimiento");
        }
    }
}
