package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.views.View;

public abstract class Option {
    public String title;
    
    public Option(String title) {
        super();
        this.title = title;
    }
    public abstract View getDestinationView();
    
    public String getTitle() {
        return title;
    }
}
