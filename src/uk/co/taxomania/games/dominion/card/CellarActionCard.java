package uk.co.taxomania.games.dominion.card;

public final class CellarActionCard extends ActionCard {

    public CellarActionCard(){
        super("Path/to/file", 2);
    } // CellarActionCard()

	@Override
    public int addCards(){
		return 0; // DISCARD ANY CARDS - ADD CARD PER CARD DISCARDED
	} // addCards()
	
	@Override
    public int addCoins(){
		return 0;
	} // addCoins()
	
	@Override
	public int addActions(){
		return 1;
	} // addActions()
	
  	@Override
	public int addBuys(){
		return 0;
	} // addBuys()
	
	@Override
    public int addVictoryPoints(){
		return 0;
	} // addVictoryPoints()
	
	@Override
	public void play(/*HAND*/){}

} // class CellarActionCard

