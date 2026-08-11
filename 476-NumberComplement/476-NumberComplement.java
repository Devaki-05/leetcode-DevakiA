// Last updated: 11/08/2026, 16:15:26
class Solution {
    public int findComplement(int num) {
      int mask =0;
      int temp =num;
      while(temp>0){
        mask =(mask<<1)|1;
        temp>>=1;
      }
    
      return num^mask;
        
    }
}