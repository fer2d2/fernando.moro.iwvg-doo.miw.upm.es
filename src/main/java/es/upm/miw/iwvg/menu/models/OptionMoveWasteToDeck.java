package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.MoveWasteToDeckView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionMoveWasteToDeck extends Option {

    public OptionMoveWasteToDeck(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveWasteToDeckView();
    }

}
