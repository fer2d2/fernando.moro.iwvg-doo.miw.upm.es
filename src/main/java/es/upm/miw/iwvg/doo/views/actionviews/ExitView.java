package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.ExitController;
import es.upm.miw.iwvg.doo.util.IO;

public class ExitView extends View {
    private ExitController exitController;

    public ExitView(ExitController controller) {
        this.exitController = controller;
    }

    public void render() {
        IO io = new IO();
        io.writeln("Adios!!!");
        this.exitController.terminate();
    }
}
