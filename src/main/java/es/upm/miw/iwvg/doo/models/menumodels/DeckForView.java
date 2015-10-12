package es.upm.miw.iwvg.doo.models.menumodels;

import es.upm.miw.iwvg.doo.models.Card;

public interface DeckForView {
    public boolean hasCards();

    public Card peek();
}
