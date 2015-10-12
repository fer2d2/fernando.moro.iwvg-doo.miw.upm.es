package es.upm.miw.iwvg.doo.models.interfaces;

import java.util.Stack;

import es.upm.miw.iwvg.doo.models.Card;

public interface MultiplePushableCardStack {
    public boolean canPush(Stack<Card> cardsToPush);
    public void push(Stack<Card> cardsToPush);
}
