package uk.co.taxomania.games.dominion.card;

public abstract class ActionCard extends Card {

    public ActionCard(final String name, final String imgPath,
                      final int cost){
        super(name, imgPath, cost);
    } // ActionCard(String, String, int)

    public abstract int addCards();
    public abstract int addCoins();
    public abstract int addActions();
    public abstract int addBuys();
    public abstract int addVictoryPoints();

    protected abstract void additionalCardActions();

} // class ActionCard

