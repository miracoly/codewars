package de.klosebrothers.apprentice.spider_to_fly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class WebTest {

    private Web web;

    @BeforeEach
    void init() {
        web = new Web("H3", "E2");
    }

    @Test
    void getPathAfterOneSpiderMoveTowardsCenterAndClockworks() {
        web.moveSpiderToNextRingTowardsCenter();
        assertEquals("H3-H2", web.getFullPath());
    }

    @Test
    void getPathAfterTwoSpiderMovesTowardsCenterAndClockworks() {
        web.moveSpiderToNextRingTowardsCenter();
        web.moveSpiderToNextRadialClockworks();
        assertEquals("H3-H2-A2", web.getFullPath());
    }

    @Test
    void getPathAfterThreeSpiderMovesTowardsCenterAndClockworks() {
        web.moveSpiderToNextRingTowardsCenter();
        web.moveSpiderToNextRadialClockworks();
        web.moveSpiderToNextRadialClockworks();
        assertEquals("H3-H2-A2-B2", web.getFullPath());
    }

    @Test
    void getPathAfterFourSpiderMovesTowardsCenterAndClockworks() {
        web.moveSpiderToNextRingTowardsCenter();
        web.moveSpiderToNextRadialClockworks();
        web.moveSpiderToNextRingTowardsCenter();
        web.moveSpiderToNextRadialClockworks();
        assertEquals("H3-H2-A2-A1-B1", web.getFullPath());
    }

    @Test
    void getPathAfterTwoSpiderMovesTowardsOutsideAndCounterClockworks() {
        web.moveSpiderToNextRingTowardsOutside();
        web.moveSpiderToNextRadialCounterClockworks();
        assertEquals("H3-H4-G4", web.getFullPath());
    }

    @Test
    void getPathAfterThreeSpiderMovesTowardsOutsideAndCounterClockworks() {
        web.moveSpiderToNextRingTowardsOutside();
        web.moveSpiderToNextRingTowardsOutside();
        web.moveSpiderToNextRadialCounterClockworks();
        assertEquals("H3-H4-H4-G4", web.getFullPath());
    }

    @Test
    void getPathAfterOneSpiderMoveFromCenter() {
        web = new Web("A0", "E2");
        web.moveSpiderFromCenter(4);
        assertEquals("A0-E1", web.getFullPath());
    }

    @Test
    void getPathAfterTwoSpiderMoveFromCenter() {
        web = new Web("A0", "E2");
        web.moveSpiderFromCenter(4);
        web.moveSpiderToNextRingTowardsCenter();
        assertEquals("A0-E1-A0", web.getFullPath());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/radialDistanceGreaterThanThree.csv", numLinesToSkip = 1,
            delimiter = ',')
    void radialDistanceGreaterThanThree(String spider, String fly) {
        web = new Web(spider, fly);
        assertTrue(web.isRadialDistanceGreaterThanThree());
   }

    @ParameterizedTest
    @CsvFileSource(resources = "/radialDistanceLessThanThree.csv", numLinesToSkip = 1, delimiter = ',')
    void radialDistanceLessThanThree(String spider, String fly) {
        web = new Web(spider, fly);
        assertFalse(web.isRadialDistanceGreaterThanThree());
    }

}