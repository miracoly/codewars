package de.klosebrothers.apprentice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpiderWebTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/getPathFromCenterTo.csv", numLinesToSkip = 1)
    void getPathFromCenterTo(String strPos, String strPath) {
        Position pos = Position.fromString(strPos);
        Position center = Position.fromString("A0");
        Path path = Path.from(SpiderWeb.getPathFromCenterTo(pos));
        assertTrue(SpiderWeb.getPathFromCenterTo(center).isEmpty());
        assertEquals(strPath, path.toString());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/getShortestPathToSameRadial.csv", numLinesToSkip = 1)
    void getShortestPathToSameRadial(String strFrom, String strTo, String strPath) {
        Position from = Position.fromString(strFrom);
        Position to = Position.fromString(strTo);
        Path path = Path.from(SpiderWeb.getShortestPathToSameRadial(from, to));
        assertEquals(strPath, path.toString());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/getShortestPathToSameRadial.csv", numLinesToSkip = 1)
    void getPathToRingOnRadial(String strFrom, String strTo, String strPath) {
        // TODO
    }

}