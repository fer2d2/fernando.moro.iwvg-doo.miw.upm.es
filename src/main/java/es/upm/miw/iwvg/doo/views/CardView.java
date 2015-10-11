package es.upm.miw.iwvg.doo.views;

import es.upm.miw.iwvg.doo.models.Card;
import es.upm.miw.iwvg.doo.util.IO;

public class CardView {
    Card card;

    public CardView(Card card) {
        this.card = card;
    }

    public void render() {
        IO io = new IO();

        if (this.card.isUncovered()) {
            io.writeln("[" + this.card.getSuit().getValue() + "," + this.card.getValue().getIdentifier() + "]");
        } else {
            io.writeln("[X,X]");
        }

    }
}
