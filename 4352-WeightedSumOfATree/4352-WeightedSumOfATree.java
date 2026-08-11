// Last updated: 11/08/2026, 16:10:25
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
      int n =parent.length;
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            adj.get(parent[i]).add(i);
        }
        int[]depth = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);
        depth[0]=1;
        int h =1;

       while(!queue.isEmpty()){
           int u = queue.poll();
           for(int v :adj.get(u)){
               depth[v]=depth[u]+1;
               if(depth[v]>h){
                   h = depth[v];
               }
               queue.offer(v);
           }
       }
        long totalSum =0;
        for(int i=0;i<n;i++){
            totalSum +=(long) nums[i]*(h-depth[i]+1);
        }
        return totalSum;
    }
}