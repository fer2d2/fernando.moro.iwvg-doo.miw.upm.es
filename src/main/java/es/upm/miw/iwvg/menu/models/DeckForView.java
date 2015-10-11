package es.upm.miw.iwvg.menu.models;

import es.upm.miw.iwvg.doo.models.Card;

public interface DeckForView {
    public boolean hasCards();
    public Card getCardOnTopWithoutPop();
}
