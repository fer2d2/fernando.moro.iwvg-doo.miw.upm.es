package es.upm.miw.iwvg.doo.views.modelviews;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.controllers.GameController;
import es.upm.miw.iwvg.doo.controllers.menucontrollers.MenuController;
import es.upm.miw.iwvg.doo.models.Foundation;
import es.upm.miw.iwvg.doo.models.Tableau;
import es.upm.miw.iwvg.doo.models.menumodels.Menu;
import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.views.actionviews.View;
import es.upm.miw.iwvg.doo.views.menuviews.MenuView;

public class GameView extends View {

    GameController gameController;

    public GameView(GameController gameController) {
        this.gameController = gameController;
    }

    public void render() {
        IO io = new IO();
        do {
            io.writeln("===========================");
            new DeckView(this.gameController.getGame().getDeck()).render();
            new WasteView(this.gameController.getGame().getWaste()).render();
            renderFoundations();
            renderTableaus();
            new MenuView(new MenuController(new Menu(this.gameController.getGame()))).render();
        } while (!this.gameController.isGameOver());
        io.writeln("GANASTE!!!");
    }

    private void renderFoundations() {
        ArrayList<Foundation> foundations = this.gameController.getGame().getFoundations();
        for (Foundation foundation : foundations) {
            new FoundationView(foundation).render();
        }
    }

    private void renderTableaus() {
        ArrayList<Tableau> tableaus = this.gameController.getGame().getTableaus();
        for (Tableau tableau : tableaus) {
            new TableauView(tableaus.indexOf(tableau) + 1, tableau).render();
        }
    }
}
