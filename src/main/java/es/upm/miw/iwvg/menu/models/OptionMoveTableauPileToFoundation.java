package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.MoveTableauPileToFoundationView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionMoveTableauPileToFoundation extends Option {

    public OptionMoveTableauPileToFoundation(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveTableauPileToFoundationView();
    }

}
