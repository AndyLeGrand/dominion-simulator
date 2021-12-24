package game;

import base.Cards;

import java.util.ArrayList;

/*
 * <h1>Class to set up players</h1>
 * This class creates player objects with a number of properties.
 * @author Andreas Kreitschmann
 * */
public class Player {
    //atributes
    private String name;
    private ArrayList<Cards> drawPile;
    private ArrayList<Cards> dropPile;

    //methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO: implement methods for shuffling, joining piles & drawing hands

}
