public class Solution {

    public int solution(int num) {
        if (num <= 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
}
