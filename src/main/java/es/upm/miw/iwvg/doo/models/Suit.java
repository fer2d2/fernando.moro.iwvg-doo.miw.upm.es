package es.upm.miw.iwvg.doo.models;

public enum Suit {
    SWORDS('e'), CUPS('c'), GOLDS('o'), CLUBS('b');

    private char value;

    private Suit(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
