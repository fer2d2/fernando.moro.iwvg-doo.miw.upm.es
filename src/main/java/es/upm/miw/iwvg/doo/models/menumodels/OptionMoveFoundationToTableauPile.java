package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveFoundationToTableauPileController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.MoveFoundationToTableauPileView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionMoveFoundationToTableauPile extends Option {

    public OptionMoveFoundationToTableauPile(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveFoundationToTableauPileView(new MoveFoundationToTableauPileController(game));
    }

}
