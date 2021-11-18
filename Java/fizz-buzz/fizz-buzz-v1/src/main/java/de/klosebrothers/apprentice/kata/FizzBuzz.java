package de.klosebrothers.apprentice.kata;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FizzBuzz {

    public static String[] getFizzBuzzArray(int count) {
        String[] fizzBuzz = new String[count];
        for (int i = 0; i < count; i++) {
            fizzBuzz[i] = convertNumToFizzBuzz(i + 1);
        }
        return fizzBuzz;
    }

    static String convertNumToFizzBuzz(int num) {
        final String fizz = num % 3 == 0 || hasSubNumInNum(3, num) ? "Fizz" : "";
        final String buzz = num % 5 == 0 || hasSubNumInNum(5, num) ? "Buzz" : "";
        final String fizzBuzz = fizz + buzz;
        return fizzBuzz.isEmpty() ? String.valueOf(num) : fizzBuzz;
    }


    static boolean hasSubNumInNum(int subNum, int num) {
        final String str = "" + num;
        return str.contains("" + subNum);
    }

}