package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveTableauPileToFoundationController;
import es.upm.miw.iwvg.doo.models.Suit;
import es.upm.miw.iwvg.doo.util.IO;

public class MoveTableauPileToFoundationView extends View {
    private MoveTableauPileToFoundationController moveTableauPileToFoundationController;

    public MoveTableauPileToFoundationView(MoveTableauPileToFoundationController moveTableauPileToFoundationController) {
        this.moveTableauPileToFoundationController = moveTableauPileToFoundationController;
    }

    @Override
    public void render() {
        IO io = new IO();

        int chosenTableau = this.askForOption("Seleccione la escalera", 7);
        int chosenFoundation = this.askForOption("Seleccione el palo", Suit.values().length);
        int chosenNumberOfCards = this.askForOption("Seleccione el numero de cartas",
                this.moveTableauPileToFoundationController.getNumberOfCardsInOrigin(chosenFoundation));

        io.writeln("Se mueve de palo a escalera");
        if (this.moveTableauPileToFoundationController.canMove(chosenTableau - 1, chosenFoundation - 1, chosenNumberOfCards)) {
            this.moveTableauPileToFoundationController.move(chosenTableau - 1, chosenFoundation - 1, chosenNumberOfCards);
        } else {
            io.writeln("ERROR!!! No se puede llevar a cabo ese movimiento");
        }
    }
}
