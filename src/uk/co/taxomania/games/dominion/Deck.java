package uk.co.taxomania.games.dominion;

import java.util.ArrayList;

import uk.co.taxomania.games.dominion.card.Card;
import uk.co.taxomania.games.dominion.card.CopperTreasureCard;
import uk.co.taxomania.games.dominion.card.EstateVictoryCard;

public class Deck {
    private static final int INITIAL_DECK_SIZE = 10;

    private final ArrayList<Card> deck = 
        new ArrayList<Card>(INITIAL_DECK_SIZE);

    private final CardList possibleCards;

    public Deck(){
        this(CardList.getRandomCardList()); // STUB
    } // Deck()

    public Deck(final CardList cards){
        possibleCards = cards;
        for (int i=0; i < 7; i++){
            deck.add(new CopperTreasureCard());
        } // for
        for (int i=0; i < 3; i++){
            deck.add(new EstateVictoryCard());
        } // for
        deck.shuffle();
    } // Deck(CardList)

    public synchronized boolean addCard(final Card card){
        return deck.add(card);
    } // addCard(Card)

    public synchronized boolean trashCard(final Card card){
        return deck.remove(card);
    } // removeCard(Card)

    public synchronized void shuffle(){
        // shuffle deck
    } // shuffle()

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
    
    public ArrayList<Card> newHand(){
    } // newHand()

} // class Deck

