package de.klosebrothers.apprentice.kata.xmas_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmasTreeTest {

    @Test
    void returnOneStarWithoutSpaces() {
        String tree = XmasTree.fromHeight(1).toString();
        assertEquals("*", tree);
    }

    @Test
    void returnEmptyString() {
        String tree = XmasTree.fromHeight(0).toString();
        assertEquals("", tree);
    }

    @Test
    void returnTreeWithTwoLevels() {
        String tree = XmasTree.fromHeight(2).toString();
        assertEquals(" *\n***", tree);
    }
}