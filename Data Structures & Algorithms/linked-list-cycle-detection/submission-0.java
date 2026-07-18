/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(null == head || null == head.next) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        
        int counter = 0;
        while(null != slow && null != fast && slow != fast) {
            if(counter % 2 == 1) {
                slow = slow.next;
            }
            fast = fast.next;
            counter++;
        }

        return slow == fast;
    }
}
