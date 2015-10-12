package es.upm.miw.iwvg.doo;

import es.upm.miw.iwvg.doo.controllers.GameController;
import es.upm.miw.iwvg.doo.models.Deck;
import es.upm.miw.iwvg.doo.models.Game;
import es.upm.miw.iwvg.doo.views.modelviews.GameView;

public class Klondike {

    private GameView gameView;

    private Game game;

    public Klondike() {
        this.game = new Game(new Deck());

        GameController gameController = new GameController(this.game);
        this.gameView = new GameView(gameController);
    }

    public void play() {
        this.gameView.render();
    }

    public static void main(String[] args) {
        new Klondike().play();
    }
}
