import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testEmpty() {
        int[] result = Solution.solve(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testSizeOne() {
        int[] result = Solution.solve(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void testNoDuplicates() {
        int[] result = Solution.solve(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void testFirstOneDuplicate() {
        int[] result = Solution.solve(new int[]{1, 1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void testThreeDuplicates() {
        int[] result = Solution.solve(new int[]{1, 1, 2, 2, 2, 5, 5, 3});
        assertArrayEquals(new int[]{1, 2, 5, 3}, result);
    }
}