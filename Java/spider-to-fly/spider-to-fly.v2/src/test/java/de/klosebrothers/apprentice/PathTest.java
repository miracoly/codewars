package de.klosebrothers.apprentice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/pathToString.csv", numLinesToSkip = 1)
    void toString(String strPos1, String strPos2, String strPos3) {
        Position pos1 = Position.fromString(strPos1);
        Position pos2 = Position.fromString(strPos2);
        Position pos3 = Position.fromString(strPos3);
        List<Position> posList = new ArrayList<>();
        posList.add(pos1);
        posList.add(pos2);
        posList.add(pos3);
        Path path = Path.from(posList);
        String manualPath = strPos1 + "-" + strPos2 + "-" + strPos3;
        assertEquals(manualPath , path.toString());
    }

    @Test
    void toStringWithEmptyList() {
        Path path = Path.from(new ArrayList<Position>());
        assertEquals("", path.toString());
    }
}