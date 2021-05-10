import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OppositeAttractTest {

    @Test
    void flowersAreBothOdd() {
        boolean isLove = OppositeAttract.isLove(3, 5);
        assertEquals(false, isLove);
    }

    @Test
    void flowersAreBothEven() {
        boolean isLove = OppositeAttract.isLove(4, 6);
        assertEquals(false, isLove);
    }

    @Test
    void flowersAreOddAndEven() {
        boolean isLove = OppositeAttract.isLove(3, 6);
        assertEquals(true, isLove);
    }

}