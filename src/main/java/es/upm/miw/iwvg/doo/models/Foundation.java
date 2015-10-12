package es.upm.miw.iwvg.doo.models;

import java.util.Stack;

import es.upm.miw.iwvg.doo.models.interfaces.MultiplePushableCardStack;
import es.upm.miw.iwvg.doo.models.interfaces.FoundationForView;
import es.upm.miw.iwvg.doo.models.interfaces.MultiplePushableCardStackForView;

public class Foundation extends CardStack implements FoundationForView, MultiplePushableCardStack {
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

    @Override
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

    @Override
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
