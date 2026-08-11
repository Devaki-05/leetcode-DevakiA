// Last updated: 11/08/2026, 16:10:28
class Solution {
    private static final int MOD =1_000_000_007;
    public int countValidSequences(int n, int k) {
        if(k>n){
            return 0;
        }
        long totalSequences = nCr(n-1,k-1); 
        long oddSequences=0;
        if((n-k)%2==0){
            oddSequences=nCr((n+k)/2-1,k-1);
        }
        long ans =(totalSequences -oddSequences+MOD)%MOD;
        return(int)ans;
    }
     private long nCr(int n,int r){
          if(r<0 ||r>n){
          return 0;
         } 
         if(r==0 || r==n){
           return 1;
       } 
        if(r>n-r){
            r= n-r;
        }
        
        long num=1;
        long den =1;
        for(int i=0;i<r;i++){
        num=(num*(n-i))%MOD;
        den = (den*(i+1))%MOD;
    }
    return(num*modInverse(den,MOD))%MOD;
    }
    private long modInverse(long base,long exp){
        return power(base,exp-2);
    }
        private long power(long base,long exp){
        long res =1;
        base%=MOD;
        while(exp>0){
            if(exp%2==1){
                res =(res*base)%MOD;
            }
            base =(base*base)%MOD;
            exp/=2;
        }
    return res; 
    }
}