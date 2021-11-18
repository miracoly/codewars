package de.klosebrothers.apprentice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void inputI() {
        assertEquals(1, RomanNumerals.convertToArabic("I"));
    }

    @Test
    void inputV() {
        assertEquals(5, RomanNumerals.convertToArabic("V"));
    }

    @Test
    void inputX() {
        assertEquals(10, RomanNumerals.convertToArabic("X"));
    }

    @Test
    void inputII() {
        assertEquals(2, RomanNumerals.convertToArabic("II"));
    }

    @Test
    void inputIII() {
        assertEquals(3, RomanNumerals.convertToArabic("III"));
    }

    @Test
    void inputVI() {
        assertEquals(6, RomanNumerals.convertToArabic("VI"));
    }

    @Test
    void inputIV() {
        assertEquals(4, RomanNumerals.convertToArabic("IV"));

    }
}