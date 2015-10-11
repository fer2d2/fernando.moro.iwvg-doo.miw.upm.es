package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.MoveTableauPileToTableauPileView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionMoveTableauPileToTableauPile extends Option {

    public OptionMoveTableauPileToTableauPile(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveTableauPileToTableauPileView();
    }

}
