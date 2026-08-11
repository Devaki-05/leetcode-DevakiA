// Last updated: 11/08/2026, 16:12:24
class Solution {
    public boolean divisorGame(int n) {
      int x=0 ;
      if(n%2==0){
        n-=x;
        if(n%2==0){
            return true;
       }else 
            return false;
       }
            return false;
    }
}