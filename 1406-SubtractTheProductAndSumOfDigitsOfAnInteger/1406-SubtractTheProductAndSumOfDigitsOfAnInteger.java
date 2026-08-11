// Last updated: 11/08/2026, 16:12:45
class Solution {
    public int subtractProductAndSum(int n) {
         int d,product=1,sum=0;
         while(n>0){
            d = n%10;
            product *=d;
            sum+=d;
            n/=10;
         }
         
         return product-sum;
        
    }
}