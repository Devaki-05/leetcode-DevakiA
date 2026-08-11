// Last updated: 11/08/2026, 16:11:13
class Solution {
    public int numberOfCuts(int n) {
    if(n==2)
      return 1;
     else if(n%2==0){
     n = n/2;
     return n ;
     }
     else if(n==1)
     return 0;
     else
     return n;
    }
}   
