package es.upm.miw.iwvg.doo.models;

import java.util.Map;
import java.util.Stack;

public class Tableau {
    
    private final int TABLEAU_STACKS = 7;
    
    private Map<String, Stack<Card>> tableauPiles;
    
    private void initializeTableauStacks(Deck deck) {
        for(int tableauPileNumber=1; tableauPileNumber<=TABLEAU_STACKS; tableauPileNumber++) {
            Stack<Card> tableauPile = new Stack<Card>();
            
            for(int cardInTableuPile=1; cardInTableuPile<=tableauPileNumber; cardInTableuPile++) {
                Card poppedCard = deck.pop();
                poppedCard = uncoverIfLastCard(tableauPileNumber, cardInTableuPile, poppedCard);
                tableauPile.push(poppedCard);
            }
            
            this.tableauPiles.put("Escalera"+tableauPileNumber, tableauPile);
        }
    }
    
    private Card uncoverIfLastCard(int tableauPileNumber, int cardInTableuPile, Card poppedCard) {
        if(cardInTableuPile==tableauPileNumber) {
            poppedCard.uncover();
        }
        return poppedCard;
    }
}
