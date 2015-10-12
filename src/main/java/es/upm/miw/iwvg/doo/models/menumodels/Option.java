package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public abstract class Option {
    public Game game;

    public String title;

    public Option(Game game, String title) {
        this.game = game;
        this.title = title;
    }

    public abstract View getDestinationView();

    public String getTitle() {
        return title;
    }
}
