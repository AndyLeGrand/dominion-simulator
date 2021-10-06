package base;

public abstract class Cards {
    String name;
    String set;
    int cost;
    String text;
    // some cards can have two types
    String additionalType;

    /*
    * class constructors:
    * Cards (String cardname, int cost): a card needs at least a name and an associated cost.
    * Cards (String cardname, String set, int cost, String card_text): optionally, the set in which this
    *   card is contained can be included and its text
    * Cards (String cardname, String set, int cost, String card_text, String additionalType):
    *   additionally, some cards have more than one type
    * */
    public Cards (String cardname, int cost) {
        this(cardname, "base", cost, "");
    }

    public Cards (String cardname, String set, int cost, String card_text) {
        this.name = cardname;
        this.set = set;
        this.cost = cost;
        this.text = card_text;
    }

    public Cards (String cardname, String set, int cost, String card_text, String additionalType) {
        this(cardname, set, cost, card_text);
        // some cards can have two types
        this.additionalType = additionalType;
    }

    // setter methods
    public void setCardname (String card_name) {
        this.name = card_name;
    }

    public void setSet (String set) {
        this.set = set;
    }

    public void setCost (int cost) {
        this.cost = cost;
    }

    public void setText (String text) {
        this.text = text;
    }

    public void setAdditionalType (String type) {
        this.additionalType = additionalType;
    }

    // getter methods
    public String getName() {
        return this.name;
    }

    public String getSet() {
        return this.set;
    }

    public int getCost() {
        return this.cost;
    }

    public String getText() {
        return this.text;
    }

    public String getAdditionalType() {
        return this.additionalType;
    }


}
