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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(null == head.next) {
            return null;
        }

        int length = 0;
        ListNode curr = head;
        while(null != curr) {
            length++;
            curr = curr.next;
        }

        int index = 0;
        curr = head;
        ListNode back = null;
        while(length - index != n) {
            back = curr;
            curr = curr.next;
            index++;
        }

        if(null == back) {
            return head.next;
        } else {
            back.next = curr.next;
            return head;
        }
    }
}
