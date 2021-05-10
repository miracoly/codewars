import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void testEmptyString() {
        String middle = Kata.getMiddle("");
        assertEquals("", middle);
    }

    @Test
    void testEvenWord() {
        String middle = Kata.getMiddle("test");
        assertEquals("es", middle);
    }

    @Test
    void testOddWord() {
        String middle = Kata.getMiddle("tests");
        assertEquals("s", middle);
    }



}