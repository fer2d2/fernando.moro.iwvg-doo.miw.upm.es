package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveDeckToWasteController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.MoveDeckToWasteView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionMoveDeckToWaste extends Option {

    public OptionMoveDeckToWaste(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveDeckToWasteView(new MoveDeckToWasteController(game));
    }

}
