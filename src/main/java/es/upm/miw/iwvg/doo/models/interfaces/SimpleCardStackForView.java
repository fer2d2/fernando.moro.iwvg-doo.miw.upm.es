package es.upm.miw.iwvg.doo.models.interfaces;

import java.util.Stack;

import es.upm.miw.iwvg.doo.models.Card;

public interface SimpleCardStackForView {
    public boolean hasCards();
    public Stack<Card> getCards();
    public Card peek();
}
