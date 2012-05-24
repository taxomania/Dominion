package uk.co.taxomania.games.dominion.card;

public final class CurseCard extends Card {

    public CurseCard(){
        super("Curse", "Path/to/file", 0);
    } // CurseCard()

    public final int getVictoryPoints(){
        return -1;
    } // getVictoryPoints()

} // class CurseCard

