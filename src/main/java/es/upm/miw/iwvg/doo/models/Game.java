package es.upm.miw.iwvg.doo.models;

import java.util.ArrayList;

public class Game {

    public static final int MAX_TABLEAUS = 7;

    public static final int MAX_FOUNDATIONS = 4;

    private Deck deck;

    private Waste waste;

    private ArrayList<Foundation> foundations;

    private ArrayList<Tableau> tableaus;

    public Game(Deck deck) {
        this.deck = deck;
        this.deck.shuffle();
        this.waste = new Waste();
        this.foundations = new ArrayList<Foundation>();
        this.initializeFoundations();
        this.tableaus = new ArrayList<Tableau>();
        this.initializeTableaus();
        this.populateTableaus();
    }

    private void populateTableaus() {
        int numberOfCardsInTableau = MAX_TABLEAUS;
        for (int currentTableauIndex = 0; currentTableauIndex < MAX_TABLEAUS; currentTableauIndex++) {
            Tableau currentTableau = this.tableaus.get(currentTableauIndex);
            currentTableau = populateTableau(numberOfCardsInTableau, currentTableau);
            currentTableau.uncoverLastCard();
            this.tableaus.set(currentTableauIndex, currentTableau);
            numberOfCardsInTableau--;
        }
    }

    private Tableau populateTableau(int numberOfCardsInTableau, Tableau currentTableau) {
        assert(numberOfCardsInTableau > 0 && numberOfCardsInTableau <= MAX_TABLEAUS);
        assert currentTableau != null;

        for (int i = 0; i < numberOfCardsInTableau; i++) {
            currentTableau.push(this.deck.pop());
        }
        return currentTableau;
    }

    private void initializeTableaus() {
        for (int tableauNumber = 0; tableauNumber < MAX_TABLEAUS; tableauNumber++) {
            this.tableaus.add(new Tableau());
        }
    }

    private void initializeFoundations() {
        for (Suit suit : Suit.values()) {
            this.foundations.add(new Foundation(suit));
        }
    }

    public boolean canMove(CardStack origin, CardStack destination) {
        assert origin != null;
        assert destination != null;

        Card cardToMove = origin.peek();
        return (origin.canPop() && destination.canPush(cardToMove));
    }

    public boolean canMove(CardStack origin, CardStack destination, int numberOfCards) {
        assert origin != null;
        assert destination != null;
        assert numberOfCards > 0 && numberOfCards <= origin.stackSize();

        return destination.canPush(origin.peekSubset(numberOfCards));
    }

    public void move(CardStack origin, CardStack destination) {
        assert origin != null;
        assert destination != null;
        assert this.canMove(origin, destination);

        destination.push(origin.pop());
    }

    public void move(CardStack origin, CardStack destination, int numberOfCards) {
        assert origin != null;
        assert destination != null;
        assert numberOfCards > 0 && numberOfCards <= origin.stackSize();

        destination.canPush(origin.popSubset(numberOfCards));
    }

    public void uncoverLastCardInTableau(int tableauIndex) {
        Tableau selectedTableau = this.tableaus.get(tableauIndex);
        selectedTableau.uncoverLastCard();
        this.tableaus.set(tableauIndex, selectedTableau);
    }

    public boolean canUncoverLastCardInTableau(int tableauIndex) {
        Tableau selectedTableau = this.tableaus.get(tableauIndex);
        return selectedTableau.CanUncoverLastCard();
    }

    public Deck getDeck() {
        return deck;
    }

    public Waste getWaste() {
        return waste;
    }

    public ArrayList<Foundation> getFoundations() {
        return foundations;
    }

    public ArrayList<Tableau> getTableaus() {
        return tableaus;
    }

    public Tableau getTableauByIndex(int index) {
        return this.tableaus.get(index);
    }

    public Foundation getFoundationByIndex(int index) {
        return this.foundations.get(index);
    }
}
