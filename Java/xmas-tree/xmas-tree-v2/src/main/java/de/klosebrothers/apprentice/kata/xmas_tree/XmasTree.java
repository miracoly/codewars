package de.klosebrothers.apprentice.kata.xmas_tree;

import java.util.ArrayList;
import java.util.List;

public class XmasTree {

    private final int height;

    public static XmasTree fromHeight(int height) {
        return new XmasTree(height);
    }

    private XmasTree(int height) {
        this.height = height; w
    }

    @Override
    public String toString() {
        final List<String> tree = generateTreeFromHeight();
        String strTree = tree.stream().reduce()
        return tree.get(0);
    }

    private List<String> generateTreeFromHeight() {
        List<String> tree = new ArrayList<>();
        if (height == 0) {
            tree.add("");
            return tree;
        }
        tree.add("*");
        return tree;
    }

}
