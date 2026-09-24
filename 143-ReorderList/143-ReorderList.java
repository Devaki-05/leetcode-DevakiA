// Last updated: 24/09/2026, 13:32:52
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode fast = dummy;
6        ListNode slow = dummy;
7
8        for (int i = 0; i <= n; i++) {
9            fast = fast.next;
10        }
11
12        while (fast != null) {
13            fast = fast.next;
14            slow = slow.next;
15        }
16
17        slow.next = slow.next.next;
18
19        return dummy.next;
20    }
21}