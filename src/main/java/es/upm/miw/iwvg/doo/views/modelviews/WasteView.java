package es.upm.miw.iwvg.doo.views.modelviews;

import es.upm.miw.iwvg.doo.models.Card;
import es.upm.miw.iwvg.doo.models.Waste;
import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class WasteView extends View {
    private Waste waste;

    public WasteView(Waste waste) {
        super();
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
