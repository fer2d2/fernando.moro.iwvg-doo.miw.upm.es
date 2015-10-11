package es.upm.miw.iwvg.doo.controllers;

import es.upm.miw.iwvg.doo.models.Deck;
import es.upm.miw.iwvg.doo.models.Foundation;
import es.upm.miw.iwvg.doo.models.Tableau;

public class GameController {

    protected Deck deck;

    protected Foundation foundation;

    protected Tableau tableau;

    public GameController(Deck deck, Foundation foundation, Tableau tableau) {
        this.deck = deck;
        this.foundation = foundation;
        this.tableau = tableau;
    }
    
    public Deck getDeck() {
        return deck;
    }

    public boolean isGameOver() {
        return false;
    }

}
