package es.upm.miw.iwvg.doo.views.modelviews;

import es.upm.miw.iwvg.doo.models.Tableau;
import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.views.actionviews.View;

public class TableauView extends View {
    int index;

    Tableau tableau;

    public TableauView(int index, Tableau tableau) {
        this.index = index;
        this.tableau = tableau;
    }

    public void render() {
        IO io = new IO();

        io.write("Escalera " + this.index + ": ");
        if (this.tableau.hasCards()) {
            this.renderCards();
            io.writeln();
        } else {
            io.writeln("<vacio>");
        }
    }

    private void renderCards() {
        IO io = new IO();

        for (int i = 0; i < (this.tableau.stackSize()); i++) {
            if (!this.tableau.getCards().get(i).isUncovered()) {
                io.write("[");
            } else {
                new CardView(this.tableau.getCards().get(i)).render();
            }
        }
    }
}
