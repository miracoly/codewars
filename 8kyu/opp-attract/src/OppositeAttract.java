public class OppositeAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        boolean flower1IsEven = flower1 % 2 == 0;
        boolean flower2IsEven = flower2 % 2 == 0;
        return flower1IsEven != flower2IsEven;
    }

}
