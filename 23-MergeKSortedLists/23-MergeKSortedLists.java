// Last updated: 11/08/2026, 16:20:40
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min-heap sorted by node values
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each non-empty list to the heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process nodes from the heap
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;

            // If the popped node has a next element, push it into the heap
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }

        return dummy.next;
    }
}