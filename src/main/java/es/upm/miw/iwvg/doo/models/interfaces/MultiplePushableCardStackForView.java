package es.upm.miw.iwvg.doo.models.interfaces;

import java.util.Stack;

import es.upm.miw.iwvg.doo.models.Card;
import es.upm.miw.iwvg.doo.models.Suit;

public interface MultiplePushableCardStackForView {
    public Stack<Card> getCards();

    public boolean hasCards();

    public int stackSize();
}
