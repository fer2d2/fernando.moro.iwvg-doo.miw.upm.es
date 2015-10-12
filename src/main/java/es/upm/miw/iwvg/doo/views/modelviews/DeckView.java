package es.upm.miw.iwvg.doo.views.modelviews;

import es.upm.miw.iwvg.doo.models.Deck;
import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class DeckView extends View {
    Deck deck;

    public DeckView(Deck deck) {
        this.deck = deck;
    }

    public void render() {
        IO io = new IO();

        io.write("Baraja: ");
        if (this.deck.hasCards()) {
            new CardView(this.deck.peek()).render();
            io.writeln();
        } else {
            io.writeln("<vacio>");
        }

    }
}
