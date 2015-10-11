package es.upm.miw.iwvg.doo.models;

import java.util.Stack;

import es.upm.miw.iwvg.menu.models.DeckForView;

import java.util.Collections;

public class Deck implements DeckForView {
    private Stack<Card> cards;

    public Deck() {
        this.cards = new Stack<Card>(); 
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

    public Card pop() {
        return cards.pop();
    }

    public Card getCardOnTopWithoutPop() {
        return cards.get(this.cards.size()-1);
    }
    
    public boolean hasCards() {
        return (this.cards.size() > 0);
    }
}
