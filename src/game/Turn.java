package game;

import java.util.ArrayList;

/*
 * <h1>Class modelling a specific turn for one player</h1>
 * This class modells and executes one turn of a single player
 * @author Andreas Kreitschmann
 * */
public class Turn {
    //atributes
    private Player curPlayer;
    private ArrayList<base.Cards[]> curHand;

    private int remainingActions;
    private int remainingBuys;

    private int numCoins;
}
