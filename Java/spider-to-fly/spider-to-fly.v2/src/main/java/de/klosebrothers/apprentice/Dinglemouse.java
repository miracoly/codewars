package de.klosebrothers.apprentice;

public class Dinglemouse {

    public static String spiderToFly(final String spider, final String fly) {
        Position spiderPos = Position.fromString(spider);
        Position flyPos = Position.fromString(fly);
        return SpiderWeb.findShortestPath(spiderPos, flyPos).toString();
    }

}
