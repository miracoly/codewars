package de.klosebrothers.apprentice.spider_to_fly;

public class Dinglemouse {

    private static Web web;

    public static String spiderToFly(final String spiderPos, final String flyPos) {
        web = new Web(spiderPos, flyPos);
        if (!web.onSamePosition()) {
            findShortestPath();
        }
        return web.getFullPath();
    }

    private static void findShortestPath() {
        if (isShortestPathThroughCenter()) {
            moveSpiderToCenter();
            if (!web.onSamePosition()) {
                moveSpiderFromCenterToFly();
            }
        } else {
            if (web.getSpider().getRing() < web.getFly().getRing()) {
                moveSpiderToSameRadial();
                moveSpiderToSameRing();
            } else {
                moveSpiderToSameRing();
                moveSpiderToSameRadial();
            }
        }
    }

    private static void moveSpiderFromCenterToFly() {
        web.getSpider().moveFromCenterOnRadial(web.getFly().getIntRadial());
        web.moveSpiderOneRingFromCenter(web.getFly().getIntRadial());
        while (!web.onSamePosition()) {
            web.moveSpiderToNextRingTowardsOutside();
        }
    }

    private static void moveSpiderToCenter() {
        while (!web.getSpider().isCenter()) {
            web.moveSpiderToNextRingTowardsCenter();
        }
    }

    private static void moveSpiderToSameRadial() {
        while (!web.onSameRadial()) {
            if (isRadialDirectionClockworks()) {
                web.moveSpiderToNextRadialClockworks();
            } else {
                web.moveSpiderToNextRadialCounterClockworks();
            }
        }
    }

    private static boolean isRadialDirectionClockworks() {
        int spiderRadial = web.getSpider().getIntRadial();
        int flyRadial = web.getFly().getIntRadial();
        return (spiderRadial > flyRadial)
                ? (spiderRadial - flyRadial) > 4
                : (flyRadial - spiderRadial) < 4;
    }

    private static void moveSpiderToSameRing() {
        while (!web.onSameRing()) {
            if (isRingDirectionToCenter()) {
                web.moveSpiderToNextRingTowardsCenter();
            } else {
                web.moveSpiderToNextRingTowardsOutside();
            }
        }
    }

    private static boolean isRingDirectionToCenter() {
        return web.getSpider().getRing() >= web.getFly().getRing();
    }

    private static boolean isShortestPathThroughCenter() {
        return web.isRadialDistanceGreaterThanThree();
    }

}
