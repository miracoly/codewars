package de.klosebrothers.apprentice.spider_to_fly;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DinglemouseTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/samePosition.csv", numLinesToSkip = 1, delimiter = ',')
    void onSamePosition(String spider, String fly, String path) {
        assertEquals(path, Dinglemouse.spiderToFly(spider, fly));
   }

    @ParameterizedTest
    @CsvFileSource(resources = "/spiderAtCenter.csv", numLinesToSkip = 1, delimiter = ',')
    void spiderAtCenter(String fly, String path) {
        assertEquals(path, Dinglemouse.spiderToFly("A0", fly));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/flyAtCenter.csv", numLinesToSkip = 1, delimiter = ',')
    void flyAtCenter(String spider, String path) {
        assertEquals(path, Dinglemouse.spiderToFly(spider, "A0"));
    }

    @Test
    void differentRingSameRadialOneAppartMoveInside() {
        assertEquals("A4-A3", Dinglemouse.spiderToFly("A4", "A3"));
    }

    @Test
    void differentRingSameRadialTwoAppartMoveInside() {
        assertEquals("A4-A3-A2", Dinglemouse.spiderToFly("A4", "A2"));
    }

    @Test
    void differentRingSameRadialThreeAppartMoveInside() {
        assertEquals("A4-A3-A2-A1", Dinglemouse.spiderToFly("A4", "A1"));
    }

    @Test
    void differentRingSameRadialOneAppartMoveOutside() {
        assertEquals("A1-A2", Dinglemouse.spiderToFly("A1", "A2"));
    }

    @Test
    void differentRingSameRadialTwoAppartMoveOutside() {
        assertEquals("A1-A2-A3", Dinglemouse.spiderToFly("A1", "A3"));
    }

    @Test
    void differentRingSameRadialThreeAppartMoveOutside() {
        assertEquals("A1-A2-A3-A4", Dinglemouse.spiderToFly("A1", "A4"));
    }

    @Test
    void moveA4ToB1() {
        assertEquals("A4-A3-A2-A1-B1", Dinglemouse.spiderToFly("A4", "B1"));
    }

    @Test
    void moveA4ToC1() {
        assertEquals("A4-A3-A2-A1-B1-C1", Dinglemouse.spiderToFly("A4", "C1"));
    }

    @Test
    void moveA4ToD1() {
        assertEquals("A4-A3-A2-A1-A0-D1", Dinglemouse.spiderToFly("A4", "D1"));
    }

    @Test
    void moveA4ToB2() {
        assertEquals("A4-A3-A2-B2", Dinglemouse.spiderToFly("A4", "B2"));
    }

    @Test
    void moveA4ToC2() {
        assertEquals("A4-A3-A2-B2-C2", Dinglemouse.spiderToFly("A4", "C2"));
    }

    @Test
    void moveA4ToD2() {
        assertEquals("A4-A3-A2-A1-A0-D1-D2", Dinglemouse.spiderToFly("A4", "D2"));
    }

    @Test
    void moveF2ToD3() {
        assertEquals("F2-E2-D2-D3", Dinglemouse.spiderToFly("F2", "D3"));
    }

    @Test
    void moveH1ToA0() {
        assertEquals("H1-A0", Dinglemouse.spiderToFly("H1", "A0"));
    }

    @Test
    void moveD1ToB4() {
        assertEquals("D1-C1-B1-B2-B3-B4", Dinglemouse.spiderToFly("D1", "B4"));
    }

    @Test
    void moveB4ToF1() {
        assertEquals("B4-B3-B2-B1-A0-F1", Dinglemouse.spiderToFly("B4", "F1"));
    }

    @Test
    void moveH1ToB1() {
        assertEquals("H1-A1-B1", Dinglemouse.spiderToFly("H1", "B1"));
    }

    @Test
    void moveH1ToC1() {
        assertEquals("H1-A0-C1", Dinglemouse.spiderToFly("H1", "C1"));
    }

    @Test
    void moveD3ToA4() {
        assertEquals("D3-D2-D1-A0-A1-A2-A3-A4", Dinglemouse.spiderToFly("D3", "A4"));
    }

    @Test
    void moveE4ToD1() {
        assertEquals("E4-E3-E2-E1-D1", Dinglemouse.spiderToFly("E4", "D1"));
    }

    @Test
    void moveC2ToG3() {
        assertEquals("C2-C1-A0-G1-G2-G3", Dinglemouse.spiderToFly("C2", "G3"));
    }

    @Test
    void moveH4ToB3() {
        assertEquals("H4-H3-A3-B3", Dinglemouse.spiderToFly("H4", "B3"));
    }

    @Test
    void moveG2ToH3() {
        assertEquals("G2-H2", Dinglemouse.spiderToFly("G2", "H2"));
    }

    @Test
    void moveE4ToG3() {
        assertEquals("E4-E3-F3-G3", Dinglemouse.spiderToFly("E4", "G3"));
    }

}