package es.upm.miw.iwvg.doo.models.interfaces;

import es.upm.miw.iwvg.doo.models.CardValue;
import es.upm.miw.iwvg.doo.models.Suit;

public interface CardForView {
    public boolean isUncovered();

    public Suit getSuit();

    public CardValue getValue();
}
