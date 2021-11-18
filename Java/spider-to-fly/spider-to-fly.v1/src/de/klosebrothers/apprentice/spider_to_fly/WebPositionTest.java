package de.klosebrothers.apprentice.spider_to_fly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebPositionTest {

    private WebPosition webPos;

    @BeforeEach
    void init() {
        webPos = new WebPosition('A', '2');
    }

    @Test
    void moveRadialClockworksOneFullRound() {
        assertEquals('A', webPos.getRadial());
        webPos.moveToNextRadialClockworks();
        assertEquals('B', webPos.getRadial());
        for (int i = 0; i < 7; i++) {
            webPos.moveToNextRadialClockworks();
        }
        assertEquals('A', webPos.getRadial());
    }

    @Test
    void moveRadialCounterClockworksOneFullRound() {
        assertEquals('A', webPos.getRadial());
        webPos.moveToNextRadialCounterClockworks();
        assertEquals('H', webPos.getRadial());
        for (int i = 0; i < 7; i++) {
            webPos.moveToNextRadialCounterClockworks();
        }
        assertEquals('A', webPos.getRadial());
    }

    @Test
    void moveRingOutsideOneFullRound() {
        assertEquals(2, webPos.getRing());
        webPos.moveToNextRingOutside();
        assertEquals(3, webPos.getRing());
        for (int i = 0; i < 4; i++) {
            webPos.moveToNextRingOutside();
        }
        assertEquals(4, webPos.getRing());
    }

    @Test
    void moveRingInsideOneFullRound() {
        assertEquals(2, webPos.getRing());
        webPos.moveToNextRingToCenter();
        assertEquals(1, webPos.getRing());
        for (int i = 0; i < 4; i++) {
            webPos.moveToNextRingToCenter();
        }
        assertEquals(0, webPos.getRing());
    }
}