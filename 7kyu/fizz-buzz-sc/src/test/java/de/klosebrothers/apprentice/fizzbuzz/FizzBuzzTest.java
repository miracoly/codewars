package de.klosebrothers.apprentice.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void numToFizzBuzz_Input1_ShouldReturn1() {
        assertEquals("1", FizzBuzz.numToFizzBuzz(1));
    }

    @Test
    void numToFizzBuzz_Input2_ShouldReturn2() {
        assertEquals("2", FizzBuzz.numToFizzBuzz(2));
    }

    @Test
    void numToFizzBuzz_Input13_ShouldReturn13() {
        assertEquals("13", FizzBuzz.numToFizzBuzz(13));
    }

    @Test
    void numToFizzBuzz_Input3_ShouldReturnFizz() {
        assertEquals("Fizz", FizzBuzz.numToFizzBuzz(3));
    }

    @Test
    void numToFizzBuzz_Input6_ShouldReturnFizz() {
        assertEquals("Fizz", FizzBuzz.numToFizzBuzz(6));
    }

    @Test
    void numToFizzBuzz_Input9_ShouldReturnFizz() {
        assertEquals("Fizz", FizzBuzz.numToFizzBuzz(9));
    }

    @Test
    void numToFizzBuzz_Input18_ShouldReturnFizz() {
        assertEquals("Fizz", FizzBuzz.numToFizzBuzz(18));
    }

    @Test
    void numToFizzBuzz_Input5_ShouldReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.numToFizzBuzz(5));
    }

    @Test
    void numToFizzBuzz_Input10_ShouldReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.numToFizzBuzz(10));
    }

    @Test
    void numToFizzBuzz_Input65_ShouldReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.numToFizzBuzz(65));
    }

    @Test
    void numToFizzbuzz_Input15_ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.numToFizzBuzz(15));
    }

    @Test
    void numToFizzbuzz_Input30_ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.numToFizzBuzz(30));
    }
}