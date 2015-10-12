package es.upm.miw.iwvg.doo.views.modelviews;

import es.upm.miw.iwvg.doo.models.Card;
import es.upm.miw.iwvg.doo.models.interfaces.SimpleCardStackForView;
import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class WasteView extends View {
    private SimpleCardStackForView waste;

    public WasteView(SimpleCardStackForView waste) {
        this.waste = waste;
    }

    public void render() {
        IO io = new IO();

        io.write("Descarte: ");
        if (this.waste.hasCards()) {
            for (Card card : this.waste.getCards()) {
                new CardView(card).render();
            }
            io.writeln();
        } else {
            io.writeln("<vacio>");
        }

    }
}
