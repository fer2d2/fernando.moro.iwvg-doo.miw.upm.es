package es.upm.miw.iwvg.doo;

public class Card {
    private Suit suit;
    private int value;
    private boolean uncovered = false;
    
    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }
}
