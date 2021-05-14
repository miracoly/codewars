package de.klosebrothers.apprentice.kata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void convertNumToFizzBuzz_InputIs3_EqualsFizz() {
        final String result = FizzBuzz.convertNumToFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    void convertNumToFizzBuzz_InputIs5_EqualsFizz() {
        final String result = FizzBuzz.convertNumToFizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    void convertNumToFizzBuzz_InputIs15_EqualsFizz() {
        final String result = FizzBuzz.convertNumToFizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void convertNumToFizzBuzz_InputIs13_EqualsFizz() {
        final String result = FizzBuzz.convertNumToFizzBuzz(13);
        assertEquals("Fizz", result);
    }

    @Test
    void hasSubNumInNum_InputIs10_isFalse() {
        assertFalse(FizzBuzz.hasSubNumInNum(3, 10));
    }

    @Test
    void hasSubNumInNum_InputIs13_isTrue() {
        assertTrue(FizzBuzz.hasSubNumInNum(3, 13));
    }

    @Test
    void hasSubNumInNum_InputIs33_isTrue() {
        assertFalse(FizzBuzz.hasSubNumInNum(5, 33));
    }

    @Test
    void hasSubNumInNum_InputIs53_isTrue() {
        assertTrue(FizzBuzz.hasSubNumInNum(5, 53));
    }

}