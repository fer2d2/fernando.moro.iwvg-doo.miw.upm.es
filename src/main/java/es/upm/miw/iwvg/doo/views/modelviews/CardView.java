package es.upm.miw.iwvg.doo.views.modelviews;

import es.upm.miw.iwvg.doo.models.Card;
import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class CardView extends View {
    Card card;

    public CardView(Card card) {
        this.card = card;
    }

    public void render() {
        IO io = new IO();

        if (this.card.isUncovered()) {
            io.write("[" + this.card.getSuit().getValue() + "," + this.card.getValue().getIdentifier() + "]");
        } else {
            io.write("[X,X]");
        }

    }
}
