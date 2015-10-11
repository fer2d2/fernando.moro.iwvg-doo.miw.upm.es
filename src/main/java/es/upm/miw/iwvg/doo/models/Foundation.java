package es.upm.miw.iwvg.doo.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Foundation {
    private Map<Suit, Stack<Card>> foundationStacks;
    
    public Foundation() {
        this.foundationStacks = new HashMap<Suit, Stack<Card>>();
        this.initializeFoundationStacks();
    }
    
    private void initializeFoundationStacks() {
        for(Suit suit : Suit.values()) {
            foundationStacks.put(suit, new Stack<Card>());
        }
    }
}
