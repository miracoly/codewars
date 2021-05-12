package de.klosebrothers.apprentice;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Position {

    public final int radial;
    public final int ring;

    public static Position fromRadialAndRing(int radial, int ring) {
        return new Position(ring == 0 ? 0 : radial, ring);
    }

    public static Position fromString(final String pos) {
        return Position.fromRadialAndRing(
                "ABCDEFGH".indexOf(pos.charAt(0)),
                Integer.parseInt(pos.substring(1))
        );
    }

    @Override
    public String toString() {
        return String.valueOf((char) (radial + 65)) + ring;
    }

    public boolean isCenter() {
        return this.ring == 0;
    }

    public int radialSteps(Position to) {
        int distance = radial > to.radial ? radial - to.radial : to.radial;
        int steps = distance > 4 ? 8 - distance : distance;
        return isCenter() || to.isCenter() ? 0 : steps;
    }


}
