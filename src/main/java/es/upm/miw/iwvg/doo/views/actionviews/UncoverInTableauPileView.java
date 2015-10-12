package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.UncoverInTableauPileController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.util.IO;

public class UncoverInTableauPileView extends View {
    private UncoverInTableauPileController uncoverInTableauPileController;

    public UncoverInTableauPileView(UncoverInTableauPileController uncoverInTableauPileController) {
        this.uncoverInTableauPileController = uncoverInTableauPileController;
    }

    @Override
    public void render() {
        IO io = new IO();

        int chosenOption = this.askForOption("Seleccione una escalera", Game.MAX_TABLEAUS);

        io.writeln("Se descubre carta");
        if (this.uncoverInTableauPileController.canUncover(chosenOption - 1)) {
            this.uncoverInTableauPileController.uncover(chosenOption - 1);
        } else {
            io.writeln("ERROR!!! No es posible voltear la carta seleccionada");
        }
    }
}
