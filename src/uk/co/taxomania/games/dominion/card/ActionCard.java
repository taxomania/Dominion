package uk.co.taxomania.games.dominion.card;

public abstract class ActionCard extends Card {

    public ActionCard(final String imgPath, final int cost){
        super(imgPath, cost);
    } // ActionCard(String)

    public abstract int addCards();
    public abstract int addCoins();
    public abstract int addActions();
    public abstract int addBuys();
    public abstract int addVictoryPoints();
	public abstract void play(/* TAKE PLAYER HAND HERE */);

} // class ActionCard

