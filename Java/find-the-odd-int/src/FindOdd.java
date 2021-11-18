import java.util.ArrayList;
import java.util.Collections;

public class FindOdd {
    public static int findIt(int[] arr) {
        ArrayList<Integer> list = intArrayToIntegerArrayList(arr);
        for (Integer num : list) {
            boolean numOccursOdd = Collections.frequency(list, num) % 2 != 0;
            if (numOccursOdd) {
                return num;
            }
        }
        return 0;
    }

    private static ArrayList<Integer> intArrayToIntegerArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(arr.length);
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
}