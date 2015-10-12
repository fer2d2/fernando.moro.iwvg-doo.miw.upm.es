package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.ExitController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.ExitView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionExit extends Option {

    public OptionExit(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new ExitView(new ExitController());
    }

}
