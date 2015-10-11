package es.upm.miw.iwvg.doo.views;

import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.menu.models.DeckForView;

public class DeckView extends View {
    DeckForView deck;

    public DeckView(DeckForView deck) {
        this.deck = deck;
    }

    public void render() {
        IO io = new IO();
        
        io.write("Baraja: ");
        if (this.deck.hasCards()) {
            new CardView(this.deck.getCardOnTopWithoutPop()).render();
        } else {
            io.writeln("<vacio>");
        }

    }
}
