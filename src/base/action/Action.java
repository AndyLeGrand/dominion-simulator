package base.action;

import base.Cards;

public abstract class Action extends Cards {
    int additionalActions;
    int additionalCards;
    int additionalBuys;
    int additionalCoins;
    int trashCards;

    public Action (String cardname, String set, int cost, String card_text,
                   int addActions, int addCards, int addBuys, int addCoins, int trashCards) {
        super(cardname, set, cost, card_text);
        this.additionalActions = addActions;
        this.additionalCards = addCards;
        this.additionalBuys = addBuys;
        this.additionalCoins = addCoins;
        this.trashCards = trashCards;
    }

    public Action (String cardname, String set, int cost, String card_text,
                   int addActions, int addCards, int addBuys, int addCoins, int trashCards, String addtionalTypes) {
        this(cardname, set, cost, card_text, addActions, addCards, addBuys, addCoins, trashCards);
        super.setAdditionalType(addtionalTypes);
    }

    public Action(String cardname, int cost, String card_text) {
        this(cardname, "base", cost, card_text,
                0, 0, 0, 0, 0);

    }
}
