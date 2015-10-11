package es.upm.miw.iwvg.doo.models;

public class Card {
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
    
    public boolean isUncovered() {
        return this.uncovered;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }
    
    
}
