package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveTableauPileToTableauPileController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.MoveTableauPileToTableauPileView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionMoveTableauPileToTableauPile extends Option {

    public OptionMoveTableauPileToTableauPile(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveTableauPileToTableauPileView(new MoveTableauPileToTableauPileController(game));
    }

}
