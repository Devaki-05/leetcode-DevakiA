// Last updated: 11/08/2026, 16:17:40
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; 
            curr.next = prev;              
            prev = curr;                 
            curr = nextTemp;             
        }

        return prev; 
    }
}