package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.UncoverInTableauPileController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.UncoverInTableauPileView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionUncoverInTableauPile extends Option {

    public OptionUncoverInTableauPile(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new UncoverInTableauPileView(new UncoverInTableauPileController(game));
    }

}
