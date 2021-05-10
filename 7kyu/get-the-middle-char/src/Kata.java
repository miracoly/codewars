public class Kata {

    public static String getMiddle(String word) {
        if (word.length() == 0) {
            return "";
        }
        boolean isEven = word.length() % 2 == 0;
        int midIndex = (word.length() - 1) / 2;
        if (isEven) {
            return word.substring(midIndex, midIndex + 2);
        }
        return word.substring(midIndex, midIndex + 1);
    }

}