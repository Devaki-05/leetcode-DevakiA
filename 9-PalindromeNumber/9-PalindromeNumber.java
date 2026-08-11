// Last updated: 11/08/2026, 16:21:09
class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
                return false;
            }
        int temp = n;
        long a = 0;
        
        while(n>0){
            
            int d = n%10;
            a = a*10+d;
            n/=10;
        }
        
        return a==temp;
        
    
    
    }
}