package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveDeckToWasteController;
import es.upm.miw.iwvg.doo.util.IO;

public class MoveDeckToWasteView extends View {

    private MoveDeckToWasteController moveDeckToWasteController;

    public MoveDeckToWasteView(MoveDeckToWasteController moveDeckToWasteController) {
        this.moveDeckToWasteController = moveDeckToWasteController;
    }

    @Override
    public void render() {
        IO io = new IO();
        io.writeln("Se mueve carta de baraja a descarte");
        if (this.moveDeckToWasteController.canMove()) {
            this.moveDeckToWasteController.move();
        } else {
            io.writeln("ERROR!!! No quedan más cartas en la baraja");
        }
    }

}
