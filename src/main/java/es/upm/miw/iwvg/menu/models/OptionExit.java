package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.controllers.ExitController;
import es.upm.miw.iwvg.doo.views.ExitView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionExit extends Option {

    public OptionExit(String title) {
        super(title);
    }

    @Override
    public View getDestinationView() {
        return (View) new ExitView(new ExitController());
    }

}
