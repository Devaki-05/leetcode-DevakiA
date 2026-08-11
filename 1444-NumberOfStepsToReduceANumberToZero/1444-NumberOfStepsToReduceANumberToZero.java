// Last updated: 11/08/2026, 16:11:53
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;   // divide by 2 if even
            } else {
                num -= 1;   // subtract 1 if odd
            }
            steps++;
        }
        return steps;
    }
}