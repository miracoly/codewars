package de.klosebrothers.apprentice.spider_to_fly;

class WebPosition {

    private int radial;
    private int ring;

    public WebPosition(char radial, char ring) {
        this.radial = radial - 65;
        this.ring = Character.getNumericValue(ring);
    }

    public char getRadial() {
        return (char) (radial + 65);
    }

    public int getIntRadial() {
        return radial;
    }

    public int getRing() {
        return ring;
    }

    public boolean isCenter() {
        return ring == 0;
    }

    public void moveToNextRadialClockworks() {
        if (!isCenter()) {
            radial = (radial >= 7) ? 0 : radial + 1;
        }
    }

    public void moveToNextRadialCounterClockworks() {
        if (!isCenter()) {
            radial = (radial <= 0) ? 7 : radial - 1;
        }
    }

    public void moveToNextRingOutside() {
        if (!isCenter()) {
            ring = (ring >= 4) ? 4 : (ring + 1);
        }
    }

    public void moveToNextRingToCenter() {
        if (!isCenter()) {
            ring = (ring <= 0) ? 0 : ring - 1;
            resetIfCenter();
        }
    }

    private void resetIfCenter() {
        if (isCenter()) {
            ring = 0;
            radial = 0;
        }
    }

    public void moveFromCenterOnRadial(int radial) {
        ring = 1;
        this.radial = radial;
    }

}
