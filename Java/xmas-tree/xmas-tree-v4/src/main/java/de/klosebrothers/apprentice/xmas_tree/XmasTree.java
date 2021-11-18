package de.klosebrothers.apprentice.xmas_tree;

public class XmasTree {

    public static String christmasTree(int height) {
        String result = "";

        for (int i = 1; i <= height; i++) {
            int star = (i * 2) - 1;
            int padding = height - i;
            result += "_".repeat(height - i) + "*".repeat(star) + "_".repeat(padding) + "\n";
        }
        return (result.isEmpty()) ? "" : result.substring(0, result.length() - 1);
    }
}
