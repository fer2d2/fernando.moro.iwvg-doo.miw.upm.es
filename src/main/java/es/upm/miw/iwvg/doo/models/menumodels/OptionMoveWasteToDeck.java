package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.controllers.actioncontrollers.MoveWasteToDeckController;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.MoveWasteToDeckView;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class OptionMoveWasteToDeck extends Option {

    public OptionMoveWasteToDeck(Game game, String title) {
        super(game, title);
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveWasteToDeckView(new MoveWasteToDeckController(game));
    }

}
