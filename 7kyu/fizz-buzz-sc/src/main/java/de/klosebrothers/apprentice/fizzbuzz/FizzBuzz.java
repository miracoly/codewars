package de.klosebrothers.apprentice.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(100);
    }

    public static void fizzBuzz(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(numToFizzBuzz(i + 1));
        }
    }

    public static String numToFizzBuzz(int num) {
        String fizzBuzz = (num % 3 == 0) ? "Fizz" : "";
        fizzBuzz += (num % 5 == 0) ? "Buzz" : "";
        return fizzBuzz.equals("") ? "" + num : fizzBuzz;
    }
}
