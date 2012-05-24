package uk.co.taxomania.games.dominion;

public class Player {
    private final String name;
    private final int playerNumber;
    private final Deck deck;

    public Player(final String name, final int no){
        this.name = name;
        playerNumber = no;
        deck = new Deck(/*set of cards*/);
    } // Player(String, int)

} // class Player
