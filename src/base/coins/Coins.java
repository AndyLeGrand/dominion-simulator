package base.coins;

import base.Cards;

public abstract class Coins extends Cards {
    int value;
    String set = "base";

    public Coins(String cardname, String set,
                 int cost, String card_text, int value) {
        super(cardname, set, cost, card_text);
        this.value = value;
    }

    public Coins(String cardname, int cost, int value) {
        this(cardname, "base", cost, "", value);
    }

}


