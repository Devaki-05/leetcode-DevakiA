// Last updated: 11/08/2026, 16:17:06
class Solution {
    public int addDigits(int num) {
    int n = num;
    int sum;
    while(n>9){
        sum=0;
        while(n!=0){
            int d= n%10;
            sum+=d;
            n/=10;
        }
        n = sum;
    }
    return n;
    }
}
        