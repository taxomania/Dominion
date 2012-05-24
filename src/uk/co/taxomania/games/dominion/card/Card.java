package uk.co.taxomania.games.dominion.card;

public abstract class Card {
    private static final String IMG_DIR = "";

    private final String name;
	private final int cost;

    public Card(final String name, final String imgPath, final int cost){
		this.name = name;
        this.cost = cost;
    } // Card(String)

    public abstract void play(/*SET UP PARAMETERS*/);

    public final int getCost(){
		return cost;
	} // getCost()

    @Override
    public boolean equals(final Object object){
        return (object != null && 
                (object instanceof Card) && 
                name.equals(((Card) object).getName()));
    } // equals(Object)

} // class Card
