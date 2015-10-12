package es.upm.miw.iwvg.doo.views.actionviews;

import es.upm.miw.iwvg.doo.util.LimitedIntDialog;

public abstract class View {
    public abstract void render();

    protected int askForOption(String title, int limit) {
        return new LimitedIntDialog(title, limit).read();
    }
}
