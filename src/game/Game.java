package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;



/*
 * <h1>Simulates a dominion game</h1>
 * This is this project's main class. It makes use of helper and card classes to simulate one
 * dominion game.
 * @author Andreas Kreitschmann
 * */
public class Game {
    // object variables
    int numPlayers;
    int curPlayer;
    String[] gameCards;

    // constructors
    public Game(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    // getter & setter methods
    public int getNumPlayers() {
        return this.numPlayers;
    }

    public int getCurPlayer() {
        return this.curPlayer;
    }

    public String[] getGameCards() {
        return this.gameCards;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void setGameCards(String[] gameCards) {
        this.gameCards = gameCards;
    }

    public void setCurPlayer(int player) {

    }


    /*
     * helper function to print basic information about this particular game.
     * */
    public void printGame() {
        if (this.gameCards == null) {
            System.out.println("No cards have been chosen yet for this game");
        } else {
            System.out.println(Arrays.toString(this.getGameCards()));
        }
    }

    public static void main(String[] args) {
        Setup new_game = new Setup("D:\\Code\\dominion-simulator\\resources\\dominion_base.csv");

        String[] headers = new_game.getHeaderArray();
        System.out.println(Arrays.toString(headers));
        System.out.println();
        ArrayList<String[]> allCards = new_game.getLineArray();

        new_game.printInput();

        HashMap<String, HashMap<String, String>> allCardsMap = new_game.inputToHashMap();
        System.out.println(allCardsMap.get("Moat").get("Types"));

    }



    }


