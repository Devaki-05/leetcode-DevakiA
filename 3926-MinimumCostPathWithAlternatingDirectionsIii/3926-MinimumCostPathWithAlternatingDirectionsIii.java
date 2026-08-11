// Last updated: 11/08/2026, 16:10:42
import java.util.Arrays;
import java.util.PriorityQueue;
class Solution {
    public long minCost(int m, int n, int[][] penalty) {
        long[][][]dist = new long[m][n][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dist[i][j],Long.MAX_VALUE);
            }
        }
        PriorityQueue<long[]>pq= new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));

        dist[0][0][1]=1;
        pq.offer(new long[]{1,0,0,1});

        int[]dr ={0,1,0,-1};
        int[]dc={1,0,-1,0};
        while(!pq.isEmpty()){
            long[] curr=pq.poll();
            long cost=curr[0];
            int r =(int)curr[1];
            int c=(int)curr[2];
            int p=(int)curr[3];

            if(r==m-1 && c==n-1){
                return cost;
            }
            if(cost > dist[r][c][p]){
                continue;
            }
             int nextP=p^1;
            long waitCost =cost+penalty[r][c];
            if(waitCost<dist[r][c][nextP]){
                dist[r][c][nextP]=waitCost;
                pq.offer(new long[]{waitCost,r,c,nextP});
            }
            for(int i=0;i<4;i++){
                int nr=  r+dr[i];
                int nc = c+dc[i];
                if(nr >=0 && nr<m &&nc >=0 &&nc<n){
                    boolean obeysParity =(p==1&&(i==0 ||i==1))||(p==0&&(i==2||i==3));
                    long entryCost =(long)(nr+1)*(nc+1);
                    long extraPenalty =obeysParity?0:penalty[r][c];
                    long nextCost =cost +entryCost +extraPenalty;
                    if(nextCost <dist[nr][nc][nextP]){
                        dist[nr][nc][nextP]=nextCost;
                        pq.offer(new long[]{nextCost,nr,nc,nextP});
                    }
                }
            }
        }
        return -1;
    }
}