package es.upm.miw.iwvg.doo.models;

public enum CardValue {
    CARD_A("A", 1),
    CARD_2("2", 2),
    CARD_3("3", 3),
    CARD_4("4", 4),
    CARD_5("5", 5),
    CARD_6("6", 6),
    CARD_7("7", 7),
    CARD_8("8", 8),
    CARD_9("9", 9),
    CARD_J("J", 10),
    CARD_Q("Q", 11),
    CARD_K("K", 12);
    
    private String identifier;
    private int value;
    
    private CardValue(String identifier, int value){
        this.identifier = identifier;
        this.value = value;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getValue() {
        return value;
    }
    
    

}
