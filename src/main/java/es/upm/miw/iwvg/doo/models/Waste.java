package es.upm.miw.iwvg.doo.models;

import java.util.Stack;

public class Waste extends CardStack {

    @Override
    public boolean canPush(Card card) {
        return true;
    }

    @Override
    public void push(Card card) {
        if (!card.isUncovered()) {
            card.uncover();
        }
        cards.push(card);
    }

    @Override
    public boolean canPush(Stack<Card> cards) {
        // TODO Auto-generated method stub
        return false;
    }

}
