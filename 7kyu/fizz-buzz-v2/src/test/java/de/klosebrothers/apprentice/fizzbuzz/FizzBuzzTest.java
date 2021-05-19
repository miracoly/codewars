package de.klosebrothers.apprentice.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturn1() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    void shouldReturn2() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    void shouldReturnFizz3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3)); }

    @Test
    void shouldReturnFizz6() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void shouldReturnBuzz5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void shouldReturnFizzBuzz15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
}