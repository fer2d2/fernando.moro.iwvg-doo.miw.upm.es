package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.UncoverInTableauPileView;
import es.upm.miw.iwvg.doo.views.View;

public class OptionUncoverInTableauPile extends Option {

    public OptionUncoverInTableauPile(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDestinationView() {
        return (View) new UncoverInTableauPileView();
    }

}
