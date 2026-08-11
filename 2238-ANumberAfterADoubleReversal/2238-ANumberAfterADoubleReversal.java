// Last updated: 11/08/2026, 16:11:20
class Solution {
   private int reverse(int num) {
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num /=10;
        }
        return rev;
   }
   public boolean isSameAfterReversals(int num){
    int reversed1 = reverse(num);
    int reversed2 = reverse(reversed1);
    return reversed2 == num;
   }
}