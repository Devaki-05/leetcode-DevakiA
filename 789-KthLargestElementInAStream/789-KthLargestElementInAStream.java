// Last updated: 11/08/2026, 16:13:04
import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int ele : nums) {
            if (pq.size() < k) {
                pq.add(ele);
            } else if (ele > pq.peek()) {
                pq.poll();
                pq.add(ele);
            }
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.add(val);
        } else if (val > pq.peek()) {
            pq.poll();
            pq.add(val); // Don't forget to add the new larger value after polling!
        }
        
        return pq.peek(); // Now correctly inside the add method
    }
}