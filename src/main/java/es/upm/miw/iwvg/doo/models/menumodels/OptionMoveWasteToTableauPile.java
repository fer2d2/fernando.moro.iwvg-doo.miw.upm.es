package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveWasteToTableauPileController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.MoveWasteToTableauPileView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionMoveWasteToTableauPile extends Option {

    public OptionMoveWasteToTableauPile(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveWasteToTableauPileView(new MoveWasteToTableauPileController(game));
    }

}
