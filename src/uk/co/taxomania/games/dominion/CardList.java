package uk.co.taxomania.games.dominion;

import java.util.ArrayList;
import java.util.Random;

import uk.co.taxomania.games.dominion.card.Card;
import uk.co.taxomania.games.dominion.card.CellarActionCard;

public class CardList {
    private static final int MAX_CARDS = 10;
    private static final Random rand = new Random();
    private final ArrayList<Card> cards;

    public static CardList getRandomCardList(){
        final ArrayList<Card> cardList = new ArrayList<Card>(10);

        for (int i = 0; i < MAX_CARDS; i++){
            Card c;

            do {
                card = ActionCards.cards.get(rand.nextInt(
                                    ActionCards.cards.size()));

                if (cardList.contains(card)){
                    card = null;
                } // if
            } while (card == null);

            cardList.add(card);
        } // for

        return new CardList(cardList);
    } // getRandomCardList()

    public static CardList chooseCardSet(){
        final ArrayList<Card> cardList = new ArrayList<Card>(10);
        
        // call UI here in loop for 10 cards

        return new CardList(cardList);
    } // chooseCardSet()

    private CardList(final ArrayList<Card> cards){
        this.cards = cards;
    } // CardList()


    private static final class ActionCards {
        private static final ArrayList<Card> cards = new ArrayList<Card>();
        static { 
            cards.add(new CellarActionCard());
            // ADD MORE CARDS HERE


        } // static

    } // class ActionCards
} // class CardList

