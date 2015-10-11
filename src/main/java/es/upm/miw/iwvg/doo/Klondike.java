package es.upm.miw.iwvg.doo;

import es.upm.miw.iwvg.doo.controllers.GameController;
import es.upm.miw.iwvg.doo.models.Deck;
import es.upm.miw.iwvg.doo.models.Foundation;
import es.upm.miw.iwvg.doo.models.Tableau;
import es.upm.miw.iwvg.doo.views.GameView;

public class Klondike {

    private GameView gameView;

    private Deck deck;

    private Foundation foundation;

    private Tableau tableau;

    public Klondike() {
        this.deck = new Deck();
        this.foundation = new Foundation();
        this.tableau = new Tableau();
        
        GameController gameController = new GameController(this.deck, this.foundation, this.tableau);
        this.gameView = new GameView(gameController);
    }

    public void play() {
        this.gameView.render();
    }

    public static void main(String[] args) {
        new Klondike().play();
    }
}
