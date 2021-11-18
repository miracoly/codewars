package de.klosebrothers.apprentice.xmas_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmasTreeTest {
    @Test
    void heightEqualsZero_returnEmptyString() {
        assertEquals("", XmasTree.christmasTree(0));
    }

    @Test
    void heightEqualsOne_returnCorrectTreeString() {
        assertEquals("*", XmasTree.christmasTree(1));
    }

    @Test
    void heightEqualsTwo_returnCorrectTreeString() {
        assertEquals("_*_\n***", XmasTree.christmasTree(2));
    }


    @Test
    void heightEqualsThree_returnCorrectTreeString() {
        assertEquals("__*__\n_***_\n*****", XmasTree.christmasTree(3));
    }

    @Test
    void heightEqualsFour_returnCorrectTreeString() {
        assertEquals("___*___\n__***__\n_*****_\n*******", XmasTree.christmasTree(4));
    }
}