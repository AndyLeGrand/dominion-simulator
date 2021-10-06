package base.victory;

import base.Cards;

public abstract class Victory extends Cards {
    int victoryPoints;

    public Victory(String cardname, String set,
                 int cost, int victoryPoints) {
        super(cardname, set, cost, "");
        this.victoryPoints = victoryPoints;
    }

    public Victory(String cardname, int cost, int victoryPoints) {
        this(cardname, "base", cost, victoryPoints);
    }

}
