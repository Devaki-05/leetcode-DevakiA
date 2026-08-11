// Last updated: 11/08/2026, 16:10:40
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n =tasks.length;
        long[]prefix = new long[n];
        prefix[0]=tasks[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+tasks[i];
        }
        long totalTime =prefix[n-1];
        int[]ans = new int[shifts.length];
        long currWork =0;
        for(int j=0;j<shifts.length;j++){
            currWork +=shifts[j];
            if(currWork >= totalTime){
                ans[j]=0;
                currWork =0;
                currWork =0;
            }else{
                int completed =upperBound(prefix,currWork);
                ans[j]= n- completed;
            }
        }
        return ans;
    }
    private int upperBound(long[]prefix,long target){
        int low =0;
        int high =prefix.length -1;
        int count=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(prefix[mid]<=target){
                count = mid+1;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return count;
    }
}