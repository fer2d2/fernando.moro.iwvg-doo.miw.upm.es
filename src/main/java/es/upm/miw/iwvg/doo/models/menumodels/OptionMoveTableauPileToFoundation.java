package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveTableauPileToFoundationController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.MoveTableauPileToFoundationView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionMoveTableauPileToFoundation extends Option {

    public OptionMoveTableauPileToFoundation(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveTableauPileToFoundationView(new MoveTableauPileToFoundationController(game));
    }

}
