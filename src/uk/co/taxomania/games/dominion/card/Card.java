package uk.co.taxomania.games.dominion.card;

public abstract class Card {
    private static final String IMG_DIR = "";
	
	private final int cost;

    public Card(final String imgPath, final int cost){
		this.cost = cost;
    } // Card(String)

    public final int getCost(){
		return cost;
	} // getCost()

} // class Card
