package es.upm.miw.iwvg.menu.controllers;

import es.upm.miw.iwvg.menu.models.Menu;

public class MenuController {
    Menu menu;

    public MenuController() {
        this.menu = new Menu();
    }

    public void redirect(int optionNumber) {
        this.menu.getOptionByOptionNumber(optionNumber).getDestinationView().render();
    }

    public Menu getMenu() {
        return menu;
    }

}
