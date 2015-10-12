package es.upm.miw.iwvg.doo.models;

import java.util.Stack;

public class Tableau extends CardStack {

    @Override
    public boolean canPush(Card cardToPush) {
        if (this.hasCards()) {
            Card latestCardInTableau = this.getCards().peek();
            if (latestCardInTableau.getValue().getNumericValue() != cardToPush.getValue().getNumericValue() - 1) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean canPush(Stack<Card> cardsToPush) {
        Tableau checkerTableau = new Tableau();
        checkerTableau.push(this.getCards());

        for (Card card : cardsToPush) {
            if (!checkerTableau.canPush(card)) {
                return false;
            } else {
                checkerTableau.push(card);
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

    public boolean CanUncoverLastCard() {
        Card lastCard = this.cards.peek();
        if (lastCard.isUncovered()) {
            return false;
        }
        return true;
    }

    public void uncoverLastCard() {
        Card lastCard = this.cards.pop();
        lastCard.uncover();
        this.cards.push(lastCard);
    }
}
