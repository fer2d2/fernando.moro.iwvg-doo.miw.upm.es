package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.MoveDeckToWasteView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionMoveDeckToWaste extends Option {

    public OptionMoveDeckToWaste(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new MoveDeckToWasteView();
    }

}
