package es.upm.miw.iwvg.doo.views;

import es.upm.miw.iwvg.doo.controllers.GameController;
import es.upm.miw.iwvg.menu.controllers.MenuController;
import es.upm.miw.iwvg.menu.views.MenuView;

public class GameView extends View {

    GameController gameController;

    public GameView(GameController gameController) {
        this.gameController = gameController;
    }

    public void render() {
        do {
            new DeckView(this.gameController.getDeck()).render();
            new MenuView(new MenuController()).render();
        } while (!this.gameController.isGameOver());
    }
}
