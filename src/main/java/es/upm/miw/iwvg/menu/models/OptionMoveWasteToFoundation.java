package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.MoveWasteToFoundationView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionMoveWasteToFoundation extends Option {

    public OptionMoveWasteToFoundation(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveWasteToFoundationView();
    }

}
