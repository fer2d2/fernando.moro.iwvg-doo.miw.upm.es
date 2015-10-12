package es.upm.miw.iwvg.doo.models;

import java.util.Stack;

public class Foundation extends CardStack {
    private Suit suit;

    public Foundation(Suit suit) {
        super();
        this.suit = suit;
    }

    public Foundation() {
    }

    @Override
    public boolean canPush(Card cardToPush) {
        if (this.suit != cardToPush.getSuit()) {
            return false;
        }

        if (this.hasCards()) {
            Card latestCardInFoundation = this.getCards().peek();
            if (latestCardInFoundation.getValue().getNumericValue() != cardToPush.getValue().getNumericValue() - 1) {
                return false;
            }
        } else {
            if (cardToPush.getValue() != CardValue.CARD_A) {
                return false;
            }
        }

        return true;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean canPush(Stack<Card> cardsToPush) {
        Foundation checkerFoundation = new Foundation(this.suit);
        checkerFoundation.push(this.getCards());

        for (Card card : cardsToPush) {
            if (!checkerFoundation.canPush(card)) {
                return false;
            } else {
                checkerFoundation.push(card);
            }
        }
        return true;
    }

    public void push(Stack<Card> cardsToPush) {
        assert cardsToPush != null;
        assert canPush(cardsToPush);

        for (Card card : cardsToPush) {
            this.push(card);
        }
    }

    public boolean isComplete() {
        int cardsPerSuit = (CardValue.values().length * Suit.values().length) / 4;
        return this.stackSize() == cardsPerSuit;
    }
}
