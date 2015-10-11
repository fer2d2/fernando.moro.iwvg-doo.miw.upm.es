package es.upm.miw.iwvg.menu.views;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.util.IO;
import es.upm.miw.iwvg.doo.util.LimitedIntDialog;
import es.upm.miw.iwvg.menu.controllers.MenuController;
import es.upm.miw.iwvg.menu.models.Option;

public class MenuView {
    private MenuController menuController;

    public MenuView(MenuController controller) {
        this.menuController = controller;
    }

    public void render() {
        IO io = new IO();
        io.writeln("---------------------------");
        this.renderMenuOptions();
        int chosenOption = this.askForOption();
        this.menuController.redirect(chosenOption);
    }

    private void renderMenuOptions() {
        IO io = new IO();
        ArrayList<Option> options = this.menuController.getMenu().getOptions();
        for (Option option : options) {
            int optionNumber = options.indexOf(option)+1;
            io.writeln(optionNumber + ". " + option.title);
        }
    }

    private int askForOption() {
        return new LimitedIntDialog("Seleccione opcion", 9).read();
    }
}
