package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.MoveWasteToTableauPileView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionMoveWasteToTableauPile extends Option {

    public OptionMoveWasteToTableauPile(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveWasteToTableauPileView();
    }

}
