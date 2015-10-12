package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveWasteToFoundationController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.MoveWasteToFoundationView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionMoveWasteToFoundation extends Option {

    public OptionMoveWasteToFoundation(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveWasteToFoundationView(new MoveWasteToFoundationController(game));
    }

}
