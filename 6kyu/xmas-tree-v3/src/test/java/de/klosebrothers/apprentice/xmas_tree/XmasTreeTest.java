package de.klosebrothers.apprentice.xmas_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmasTreeTest {
    @Test
    void heightEqualsZero_returnEmptyString() {
        assertEquals("", XmasTree.christmasTree(0));
    }

}