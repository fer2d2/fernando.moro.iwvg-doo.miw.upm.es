package es.upm.miw.iwvg.doo.controllers.menucontrollers;

import es.upm.miw.iwvg.doo.models.menumodels.Menu;

public class MenuController {
    private Menu menu;

    public MenuController(Menu menu) {
        this.menu = menu;
    }

    public void redirect(int optionNumber) {
        this.menu.getOptionByOptionNumber(optionNumber).getDestinationView().render();
    }

    public Menu getMenu() {
        return menu;
    }

}
