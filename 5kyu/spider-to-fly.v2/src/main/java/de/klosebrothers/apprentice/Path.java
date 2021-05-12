package de.klosebrothers.apprentice;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public final class Path {

    private final List<Position> startAndSteps;

    public static Path from(List<Position> startAndSteps) {
        return new Path(startAndSteps);
    }

    @Override
    public String toString() {
        String strPath = "";
        for (Position pos : startAndSteps) {
            strPath += pos.toString() + "-";
        }
        return !startAndSteps.isEmpty() ? strPath.substring(0, strPath.length() - 1) : "";
    }

}
