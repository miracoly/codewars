package de.klosebrothers.apprentice.xmas_tree;

public class XmasTree {

    public static String christmasTree(int height) {
        String result = "";
        for (int i = 1; i <= height; i++) {
            int padding = height - i;
            int stars = (i * 2) - 1;
            result += "_".repeat(padding) + "*".repeat(stars) + "_".repeat(padding) + "\n";
        }
        return (result.isEmpty()) ? "" : result.substring(0, result.length() - 1);
    }
}