package es.upm.miw.iwvg.doo.models;

import java.util.Stack;

public abstract class CardStack {
    protected Stack<Card> cards;

    public CardStack() {
        this.cards = new Stack<Card>();
    }

    public abstract boolean canPush(Card card);

    public abstract boolean canPush(Stack<Card> cards);

    public boolean canPop() {
        return this.stackSize() > 0;
    }

    public Card pop() {
        return cards.pop();
    }

    public void push(Card card) {
        cards.push(card);
    }

    public boolean hasCards() {
        return (this.cards.size() > 0);
    }

    public Card peek() {
        return cards.get(this.cards.size() - 1);
    }

    public Stack<Card> getCards() {
        return cards;
    }

    public int stackSize() {
        return cards.size();
    }

    public Stack<Card> peekSubset(int fromPosition) {
        Stack<Card> subset = new Stack<Card>();
        for (int i = fromPosition; i < this.stackSize(); i++) {
            subset.push(this.cards.get(i));
        }
        return subset;
    }

    public Stack<Card> popSubset(int fromPosition) {
        Stack<Card> subset = new Stack<Card>();
        for (int i = fromPosition; i < this.stackSize(); i++) {
            subset.push(this.cards.get(i));
            this.cards.remove(i);
        }
        return subset;
    }

}
