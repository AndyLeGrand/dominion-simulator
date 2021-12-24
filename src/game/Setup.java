package game;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
* <h1>Helper class to read game input from file for later use</h1>
* In its first implementation, this class expects a csv file, containing
* one line per game card.
* @author Andreas Kreitschmann
* */
public class Setup {
    // object variables
    String filename;

    // constructors
    public Setup (String filename) {
        this.filename = filename;
    }

    // object methods
    public void setFilePath (String path) {
        this.filename = path;
    }

    public String getFilePath () {
        return this.filename;
    }

    protected Scanner readFromFile() {
        Scanner sc = new Scanner("no valid file specified");
        try {
            File inputFile = new File(this.getFilePath());
            sc = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Please provide valid file path");
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        return sc;
    }

    /*
     * This method creates an Array of Strings containing
     * the headers / categories for which each card in the game has entries.
     * examples: name, text, cost etc.
     * @return String[]
     * */
    public String[] getHeaderArray() {
        Scanner sc = this.readFromFile();

        String headers = sc.nextLine();
        String[] headerArray = headers.split(";");

        sc.close();

        return headerArray;
    }

    /*
    * This method creates an ArrayList with each element corresponding
    * to one line from the corresponding input file.
    * @return ArrayList<String[]>
    * */
    public ArrayList<String[]> getLineArray() {
        Scanner sc = this.readFromFile();
        ArrayList<String[]> cardsAvailable = new ArrayList<String[]>();

        // skip the first line
        sc.nextLine();

        // add lines to ArrayList
        while (sc.hasNextLine()) {
            cardsAvailable.add(sc.nextLine().split(";"));
        }
        sc.close();
        return cardsAvailable;
    }


    /*
    * This function creates a nested HashMap which holds all cards and their respective properties.
    * The goal is to have a structure which can be flexibly queried for specific properties.
    * Example: allCardsMap.get("Copper").get("Cost") should return the cost of a copper card.
    * @return HashMap<String, HashMap<String, String>> nested HashMap which holds all card properties.
    * */
    public HashMap<String, HashMap<String, String>> inputToHashMap() {
        HashMap<String, HashMap<String, String>> allCardsHashMap = new HashMap<>();

        // using the two previously defined helper functions to fill hashmap
        String[] headers = this.getHeaderArray();
        ArrayList<String[]> allCards = this.getLineArray();

        for (int i = 0; i < allCards.size(); i++) {
            String name  = allCards.get(i)[0];

            // filling the inner hashamp, i.e. populate each card's attributes
            HashMap<String, String> tmp = new HashMap<>();
            for (int j = 0; j < headers.length; j++) {
                tmp.put(headers[j], allCards.get(i)[j]);
                //System.out.println(headers[j] + ", " + allCards.get(i)[j]);
            }

            allCardsHashMap.put(name, tmp);
            //System.out.println(tmp);
        }
        return allCardsHashMap;
    }

    /*
     * This method prints a readable version of the input file
     * */
    public void printInput() {
        HashMap<String, HashMap<String, String>> allCardsMap = this.inputToHashMap();

        allCardsMap.forEach(
                (key, value)
                        -> System.out.println(key + " " + value));

    }


}
