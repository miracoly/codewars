package de.klosebrothers.apprentice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    private final Position center = Position.fromString("A0");

    @ParameterizedTest
    @CsvFileSource(resources = "/allPossiblePositions.csv", numLinesToSkip = 1)
    void toString(String strPos) {
        Position pos = Position.fromString(strPos);
        assertEquals(strPos, pos.toString());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/radialStepsTo.csv", numLinesToSkip = 1)
    void radialSteps(String strPos1, String strPos2, int steps) {
        Position pos1 = Position.fromString(strPos1);
        Position pos2 = Position.fromString(strPos2);
        assertEquals(steps, pos1.radialSteps(pos2));
        assertEquals(0, pos1.radialSteps(center));
    }
}