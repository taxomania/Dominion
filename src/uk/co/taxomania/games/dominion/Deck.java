package uk.co.taxomania.games.dominion;

import java.util.ArrayList;

import uk.co.taxomania.games.dominion.card.Card;

public class Deck {
    private final ArrayList<Card> deck = new ArrayList<Card>(5);

    public Deck(/*Need to give set of cards first?*/){
    } // Deck()

    public synchronized boolean addCard(final Card card){
        return deck.add(card);
    } // addCard(Card)

    public synchronized boolean trashCard(final Card card){
        return deck.remove(card);
    } // removeCard(Card)

    public boolean contains(final Card card) {
        return deck.contains(card);
    } // contains(Card)

    public Card get(final int index){
        return deck.get(index);
    } // get(int)

    public Card get(final Card card){
        for (final Card c : deck){
            if (c.equals(card)){
                return c;
            } // if
        } // for
    } // get(Card)
    
} // class Deck

