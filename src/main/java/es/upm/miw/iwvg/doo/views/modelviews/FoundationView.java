package es.upm.miw.iwvg.doo.views.modelviews;

import es.upm.miw.iwvg.doo.models.Card;
import es.upm.miw.iwvg.doo.models.Foundation;
import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class FoundationView extends View {

    Foundation foundation;

    public FoundationView(Foundation foundation) {
        this.foundation = foundation;
    }

    public void render() {
        IO io = new IO();

        io.write("Palo " + this.foundation.getSuit().getValue() + ": ");
        if (this.foundation.hasCards()) {
            this.renderCardList();
            io.writeln();
        } else {
            io.writeln("<vacio>");
        }

    }

    private void renderCardList() {
        IO io = new IO();
        for (Card card : this.foundation.getCards()) {
            new CardView(card).render();
        }
        for (int i = 0; i < (this.foundation.stackSize() - 1); i++) {
            io.write("[");
        }
    }
}
