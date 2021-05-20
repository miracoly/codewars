package de.klosebrothers.apprentice;

import java.util.Arrays;
import java.util.List;

public class RomanNumerals {
    public static int convertToArabic(String roman) {
        List<String> characters = Arrays.asList(roman.split(""));
        int result = 0;

        for (int i = 0; i < characters.size(); i++) {
            String character = characters.get(i);
            if (character.equals("I") && (i + 1) < characters.size()) {
                String next = characters.get(i + 1);
                if (!next.equals("I")) {
                    result--;
                } else {
                    result++;
                }
            } else {
                result += convertSingleNumeral(character);
            }
        }

        return result;
    }

    private static int convertSingleNumeral(String roman) {
        if (roman.equals("X")) {
            return 10;
        }
        if (roman.equals("V")) {
            return 5;
        }
        return 1;
    }
}
