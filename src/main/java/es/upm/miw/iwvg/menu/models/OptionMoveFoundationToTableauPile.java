package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.MoveFoundationToTableauPileView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionMoveFoundationToTableauPile extends Option {

    public OptionMoveFoundationToTableauPile(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveFoundationToTableauPileView();
    }

}
