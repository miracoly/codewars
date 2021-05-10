package de.klosebrothers.apprentice.spider_to_fly;

class Web {

    private WebPosition spider;
    private WebPosition fly;
    private StringBuilder path = new StringBuilder();

    public Web(String spider, String fly) {
        this.spider = new WebPosition(spider.charAt(0), spider.charAt(1));
        this.fly = new WebPosition(fly.charAt(0), fly.charAt(1));
        path.append(this.spider.getRadial());
        path.append(this.spider.getRing());
    }

    public WebPosition getSpider() {
        return spider;
    }

    public WebPosition getFly() {
        return fly;
    }

    public void moveSpiderToNextRingTowardsCenter() {
        getSpider().moveToNextRingToCenter();
        addCurrentPositionToPath();
    }

    public void moveSpiderToNextRadialClockworks() {
        getSpider().moveToNextRadialClockworks();
        addCurrentPositionToPath();
    }

    public void moveSpiderToNextRingTowardsOutside() {
        getSpider().moveToNextRingOutside();
        addCurrentPositionToPath();
    }

    public void moveSpiderToNextRadialCounterClockworks() {
        getSpider().moveToNextRadialCounterClockworks();
        addCurrentPositionToPath();
    }

    public void moveSpiderFromCenter(int radial) {
        getSpider().moveFromCenterOnRadial(radial);
        addCurrentPositionToPath();
    }

    public void moveSpiderOneRingFromCenter(int radial) {
        getSpider().moveFromCenterOnRadial(radial);
        addCurrentPositionToPath();
    }

    private void addCurrentPositionToPath() {
        path.append("-");
        path.append(spider.getRadial());
        path.append(spider.getRing());
    }

    public String getFullPath() {
        return path.toString();
    }

    public boolean onSamePosition() {
        return onSameRing() &&onSameRadial();
    }

    public boolean onSameRing() {
        return spider.getRing() == fly.getRing();
    }

    public boolean onSameRadial() {
        return spider.getIntRadial() == fly.getIntRadial();
    }

    public boolean isRadialDistanceGreaterThanThree() {
        int distance = spider.getIntRadial() > fly.getIntRadial()
                ? spider.getIntRadial() - fly.getIntRadial()
                : fly.getIntRadial() - spider.getIntRadial();
        return (distance > 2) && (distance < 6) || spider.isCenter();
    }

}
