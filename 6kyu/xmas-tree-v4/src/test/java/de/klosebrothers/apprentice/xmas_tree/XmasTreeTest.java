


package de.klosebrothers.apprentice.xmas_tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XmasTreeTest {
    @Test
    void heightIsZero_returnEmtpyTree() {
        assertEquals("", XmasTree.christmasTree(0));
    }

    @Test
    void heightIsOne_returnCorrectTree() {
        assertEquals("*", XmasTree.christmasTree(1));
    }

    @Test
    void heightIsTwo_returnCorrectTree() {
        assertEquals("_*_\n***", XmasTree.christmasTree(2));
    }

    @Test
    void heightIsThree_returnCorrectTree() {
        assertEquals("__*__\n_***_\n*****", XmasTree.christmasTree(3));
    }

    @Test
    void heightIsFour_returnCorrectTree() {
        assertEquals("___*___\n__***__\n_*****_\n*******", XmasTree.christmasTree(4));
        Assertions.assertThat(XmasTree.christmasTree(4)).startsWith("___*");
    }

}