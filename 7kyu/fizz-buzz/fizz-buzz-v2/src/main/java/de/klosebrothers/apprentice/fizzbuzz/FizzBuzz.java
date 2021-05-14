package de.klosebrothers.apprentice.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        String result = "";
        result += isModuloZero(number, 3) ? "Fizz" : "";
        result += isModuloZero(number, 5) ? "Buzz" : "";
        return result.isEmpty() ? "" + number : result;
    }

    private static boolean isModuloZero(int number, int modulo) {
        return number % modulo == 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i + 1));
        }
    }

}
