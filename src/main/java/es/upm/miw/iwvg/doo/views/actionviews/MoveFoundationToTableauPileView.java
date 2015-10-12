package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveFoundationToTableauPileController;
import es.upm.miw.iwvg.doo.models.Suit;
import es.upm.miw.iwvg.doo.util.IO;

public class MoveFoundationToTableauPileView extends View {
    private MoveFoundationToTableauPileController moveFoundationToTableauPileController;

    public MoveFoundationToTableauPileView(MoveFoundationToTableauPileController moveFoundationToTableauPileController) {
        this.moveFoundationToTableauPileController = moveFoundationToTableauPileController;
    }

    @Override
    public void render() {
        IO io = new IO();

        int chosenFoundation = this.askForOption("Seleccione el palo", Suit.values().length);
        int chosenTableau = this.askForOption("Seleccione la escalera", 7);
        int chosenNumberOfCards = this.askForOption("Seleccione el numero de cartas",
                this.moveFoundationToTableauPileController.getNumberOfCardsInOrigin(chosenFoundation));

        io.writeln("Se mueve de palo a escalera");
        if (this.moveFoundationToTableauPileController.canMove(chosenFoundation - 1, chosenTableau - 1, chosenNumberOfCards)) {
            this.moveFoundationToTableauPileController.move(chosenFoundation - 1, chosenTableau - 1, chosenNumberOfCards);
        } else {
            io.writeln("ERROR!!! No se puede llevar a cabo ese movimiento");
        }
    }
}
