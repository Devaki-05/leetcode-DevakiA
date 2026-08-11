// Last updated: 11/08/2026, 16:12:26
class RecentCounter {
    private int[] records;
    private int start;
    private int end;

    public RecentCounter() {
        
        records = new int[3002]; 
        start = 0;
        end = 0;
    }
    
    public int ping(int t) {
        records[end] = t;
        end = (end + 1) % records.length;

        
        while (records[start] < t - 3000) {
            start = (start + 1) % records.length;
        }

        return (end - start + records.length) % records.length;
    }
}