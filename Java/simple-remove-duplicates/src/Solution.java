public class Solution {

    public static int[] solve(int[] arr) {
        var list = new java.util.ArrayList<Integer>();
        for (int num : arr) {
            list.removeIf(elem -> elem == num);
            list.add(num);
        }
        return list.stream().mapToInt(elem -> elem).toArray();
    }

}
