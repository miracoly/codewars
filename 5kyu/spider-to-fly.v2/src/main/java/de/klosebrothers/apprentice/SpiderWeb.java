package de.klosebrothers.apprentice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public final class SpiderWeb {

    private SpiderWeb() {
    }

    public static Path findShortestPath(final Position spider, final Position fly) {
        final List<Position> posList = new ArrayList<>();
        final Supplier<Position> lastPos = () -> posList.get(posList.size() - 1);
        posList.add(spider);
        if (isShortestPathThroughCenter(spider, fly)) {
            posList.addAll(getPathToCenterFrom(lastPos.get()));
            posList.addAll(getPathFromCenterTo(fly));
        } else {
            if (spider.ring < fly.ring) {
                posList.addAll(getShortestPathToSameRadial(spider, fly));
                posList.addAll(getPathToRingOnRadial(lastPos.get(), fly));
            } else {
                posList.addAll(getPathToRingOnRadial(spider, fly));
                posList.addAll(getShortestPathToSameRadial(lastPos.get(), fly));
            }
        }
        return Path.from(posList);
    }

    public static List<Position> getPathToRingOnRadial(Position from, Position to) {
        final int radial = from.isCenter() ? to.radial : from.radial;
        final int ringStart = from.ring;
        final int ringLast = to.ring;
        final int step = Integer.signum(ringLast - ringStart);

        final List<Position> posList = new ArrayList<>();
        for (int curRing = ringStart + step; curRing != ringLast ; curRing += step) {
            posList.add(Position.fromRadialAndRing(radial, curRing));
        }
        return posList;
    }

    public static List<Position> getShortestPathToSameRadial(Position from, Position to) {
        final List<Position> posList = new ArrayList<>();
        final boolean isDirectionClockwise = (from.radial > to.radial)
                ? (from.radial - to.radial) > 4
                : (to.radial - from.radial) < 4;
        int curRadial = from.radial;
        while (curRadial != to.radial) {
            curRadial = isDirectionClockwise
                    ? (curRadial == 7 ? 0 : curRadial + 1)
                    : (curRadial == 0 ? 7 : curRadial - 1);
            posList.add(Position.fromRadialAndRing(curRadial, from.ring));
        }
        return posList;
    }

    public static List<Position> getPathFromCenterTo(Position to) {
        final List<Position> posList = new ArrayList<>();
        for (int ring = 1; ring <= to.ring; ring++) {
            posList.add(Position.fromRadialAndRing(to.radial, ring));
        }
        return posList;
    }

    private static List<Position> getPathToCenterFrom(Position from) {
        final List<Position> posList = new ArrayList<>();
        for (int ring = from.ring; ring > 0; ring--) {
            posList.add(Position.fromRadialAndRing(from.radial, ring));
        }
        return posList;
    }

    private static boolean isShortestPathThroughCenter(final Position spider, final Position fly) {
        final int steps = spider.radialSteps(fly);
        return Math.abs(steps) > 2 || spider.isCenter() || fly.isCenter();
    }

}
