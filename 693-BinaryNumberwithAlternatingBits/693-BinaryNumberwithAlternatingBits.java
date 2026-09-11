// Last updated: 11/09/2026, 16:02:27
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        if(arr.length ==0) return 0;
4
5        int inc =1;
6        int dec =1;
7        int maxLen =1;
8
9        for(int i=1;i<arr.length;i++){
10            if(arr[i]>arr[i-1]){
11                inc = dec+1;
12                dec =1;
13            }else if(arr[i]<arr[i-1]){
14                dec = inc+1;
15                inc =1;
16            }else{
17                inc =1;
18                dec =1;
19            }
20            maxLen = Math.max(maxLen,Math.max(inc,dec));
21        }
22        return maxLen;
23    }
24}