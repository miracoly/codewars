import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOddTest {

    @Test
    void firstTestArrayOfSizeOne() {
        int odd = FindOdd.findIt(new int[]{1});
        assertEquals(1, odd);
    }

    @Test
    void secondTestArrayOfSizeOne() {
        int odd = FindOdd.findIt(new int[]{2});
        assertEquals(2, odd);
    }

    @Test
    void testArraySizeOfThree() {
        int odd = FindOdd.findIt(new int[]{1, 2, 2});
        assertEquals(1, odd);
    }

    @Test
    void testArraySizeOfTen() {
        int odd = FindOdd.findIt(new int[]{1, 2, 2, 1, 3, 3, 4, 4, 4});
        assertEquals(4, odd);
    }

}