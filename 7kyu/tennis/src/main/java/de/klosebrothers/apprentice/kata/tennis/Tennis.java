package de.klosebrothers.apprentice.kata.tennis;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static final Map<Integer, String> map = new HashMap<Integer, String>() {{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
    }};

    public static String parseScore(int scoreA, int scoreB) {
        if (scoreA == scoreB) {
            if (scoreA == 3) {
                return "Deuce";
            }
            return map.get(scoreA) + " all";
        }
        return map.get(scoreA) + ", " + map.get(scoreB);
    }

}