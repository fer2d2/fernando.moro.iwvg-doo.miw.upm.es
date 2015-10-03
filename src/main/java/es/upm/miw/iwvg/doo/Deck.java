package es.upm.miw.iwvg.doo;

import java.util.Stack;
import java.util.Collections;

public class Deck {
    private static final int CARDS_PER_SUIT = 12;
    private Stack<Card> cards;
    
    public Deck() {
        generateDeck();
    }

    private void generateDeck() {
        for(Suit suit : Suit.values()) {
            for(int i=1; i<=this.CARDS_PER_SUIT; i++) {
                cards.push(new Card(suit, i));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
    
    public Card draw() {
        return cards.pop();
    }
}
