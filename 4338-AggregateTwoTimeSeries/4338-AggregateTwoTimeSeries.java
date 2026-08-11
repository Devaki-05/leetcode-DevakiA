// Last updated: 11/08/2026, 16:10:35
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int n = series1.length;
        int m = series2.length;
        TreeSet<Integer> timestampSet = new TreeSet<>();
        for(int[]p :series1){
            timestampSet.add(p[0]);
        }
        for(int[]p :series2){
            timestampSet.add(p[0]);
        }
        List<List<Integer>> result = new ArrayList<>();
        int i=0;
        int j=0;
        for(int t:timestampSet){
            while(i<n && series1[i][0]<t){
                i++;
            }
            int val1 =(i<n) ? series1[i][1]:0;
            while(j<m && series2[j][0]<t){
                j++;
            }
            int val2 =(j<m )? series2[j][1]:0;
            result.add(Arrays.asList(t,val1+val2));
        }
        return result;
    }
}