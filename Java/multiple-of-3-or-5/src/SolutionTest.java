import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    void testZero() {
        int sum = solution.solution( 0);
        assertEquals(0, sum);
    }

    @Test
    void testNegative() {
        int sum = solution.solution( -30);
        assertEquals(0, sum);
    }

    @Test
    void testTen() {
        int sum = solution.solution( 10);
        assertEquals(23, sum);
    }

    @Test
    void testTwelve() {
        int sum = solution.solution( 12);
        assertEquals(33, sum);
    }

    @Test
    void testFifteen() {
        int sum = solution.solution( 15);
        assertEquals(45, sum);
    }

}