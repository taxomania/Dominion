package uk.co.taxomania.games.dominion.card;

public abstract class VictoryCard extends Card {
	private final int victoryPoints;

    public VictoryCard(final String name, final String imgPath, final int cost, final int victoryPoints){
        super(name, imgPath, cost);
		this.victoryPoints = victoryPoints;
    } // VictoryCard(String)

    public final int getVictoryPoints(){
		return victoryPoints;
	} // getVictoryPoints()

} // class VictoryCard

