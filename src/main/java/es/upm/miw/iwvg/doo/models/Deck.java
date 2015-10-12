package es.upm.miw.iwvg.doo.models;

import java.util.Collections;
import java.util.Stack;

import es.upm.miw.iwvg.doo.models.interfaces.SimpleCardStackForView;

public class Deck extends CardStack implements SimpleCardStackForView {
    public Deck() {
        super();
        generateDeck();
    }

    private void generateDeck() {
        for (Suit suit : Suit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                cards.push(new Card(suit, cardValue));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public Card pop() {
        return cards.pop();
    }

    @Override
    public Card peek() {
        return cards.peek();
    }

    @Override
    public boolean hasCards() {
        return (this.cards.size() > 0);
    }

    @Override
    public boolean canPush(Card card) {
        return false;
    }

    @Override
    public boolean canPush(Stack<Card> cards) {
        return false;
    }
}
