package es.upm.miw.iwvg.doo.models.menumodels;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.models.Game;

public class Menu {
    private ArrayList<Option> options;

    public Menu(Game game) {
        this.options = new ArrayList<Option>();
        this.options.add(new OptionMoveDeckToWaste(game, "Mover de baraja a descarte"));
        this.options.add(new OptionMoveFoundationToTableauPile(game, "Mover de palo a escalera"));
        this.options.add(new OptionMoveTableauPileToFoundation(game, "Mover de escalera a palo"));
        this.options.add(new OptionMoveTableauPileToTableauPile(game, "Mover de escalera a escalera"));
        this.options.add(new OptionMoveWasteToDeck(game, "Mover de descarte a baraja"));
        this.options.add(new OptionMoveWasteToFoundation(game, "Mover de descarte a palo"));
        this.options.add(new OptionMoveWasteToTableauPile(game, "Mover de descarte a escalera"));
        this.options.add(new OptionUncoverInTableauPile(game, "Voltear en escalera"));
        this.options.add(new OptionExit(game, "Salir"));
    }

    public Option getOptionByOptionNumber(int optionNumber) {
        return this.options.get(optionNumber);
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

}
