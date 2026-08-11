// Last updated: 11/08/2026, 16:18:13
class Solution {
    public int reverseBits(int n) {
        int result=0;
    for(int i=0;i<32;i++){
        result=(result<<1)|(n&1);
        n>>=1;
    }
    return result;
        
    }
    
}