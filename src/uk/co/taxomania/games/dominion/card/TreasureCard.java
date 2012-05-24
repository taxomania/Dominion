package uk.co.taxomania.games.dominion.card;

public abstract class TreasureCard extends Card {
	private final int treasureValue;

    public TreasureCard(final String name, final String imgPath, final int cost, final int treasureValue){
        super(name, imgPath, cost);
		this.treasureValue = treasureValue;
    } // TreasureCard(String)

    public final int getTreasureValue(){
		return treasureValue;
	} // getTreasureValue()

} // class TreasureCard

