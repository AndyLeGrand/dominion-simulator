package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Game {

    public static void main(String[] args) {
        Setup new_game = new Setup("D:\\Code\\dominion-simulator\\resources\\dominion_base.csv");

        String[] headers = new_game.getHeaderArray();
        System.out.println(Arrays.toString(headers));
        System.out.println();
        ArrayList<String[]> allCards = new_game.getLineArray();
        HashMap<String, HashMap<String, String>> allCardsMap = new_game.inputToHashMap();

        allCardsMap.forEach(
                (key, value)
                    -> System.out.println(key + " " + value));
        }

        // System.out.println(allCardsMap.get("Gardens"));

    }


