package es.upm.miw.iwvg.menu.models;

import java.util.ArrayList;

/**
 * Hacer una clase menu, que haga el dispatch.
 * Hacemos una clase intermedia, Opción, que tiene
 * una jerarquía de opciones. El menú tiene un array
 * polimórfico de opciones.
 * 
 * NO poner un switch ni sentencias IF anidadas.
 */
public class Menu {
    private ArrayList<Option> options;
    
    public Menu() {
        this.options = new ArrayList<Option>();
        this.options.add(new OptionMoveDeckToWaste("Mover de baraja a descarte"));
        this.options.add(new OptionMoveFoundationToTableauPile("Mover de palo a escalera"));
        this.options.add(new OptionMoveTableauPileToFoundation("Mover de escalera a palo"));
        this.options.add(new OptionMoveTableauPileToTableauPile("Mover de escalera a escalera"));
        this.options.add(new OptionMoveWasteToDeck("Mover de descarte a baraja"));
        this.options.add(new OptionMoveWasteToFoundation("Mover de descarte a palo"));
        this.options.add(new OptionMoveWasteToTableauPile("Mover de descarte a escalera"));
        this.options.add(new OptionUncoverInTableauPile("Voltear en escalera"));
        this.options.add(new OptionExit("Salir"));
    }
    
    public Option getOptionByOptionNumber(int optionNumber) {
        return this.options.get(optionNumber-1);
    }

    public ArrayList<Option> getOptions() {
        return options;
    }
}
