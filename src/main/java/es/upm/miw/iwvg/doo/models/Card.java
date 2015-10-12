package es.upm.miw.iwvg.doo.models;

import es.upm.miw.iwvg.doo.models.interfaces.CardForView;

public class Card implements CardForView {
    private Suit suit;

    private CardValue value;

    private boolean uncovered = false;

    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public void uncover() {
        this.uncovered = true;
    }

    @Override
    public boolean isUncovered() {
        return this.uncovered;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public CardValue getValue() {
        return value;
    }

}
