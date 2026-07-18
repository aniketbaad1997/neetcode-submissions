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
    public void reorderList(ListNode head) {
        System.out.println("started");
        if(null != head.next && null != head.next.next) {
            ListNode list1 = head;
            ListNode mid = findMid(head);
            ListNode list2 = reverseList(mid.next);
            mid.next = null;
            
            ListNode next1 = null;
            ListNode next2 = null;
            while(null != list1 && null != list2) {
                next1 = list1.next;
                next2 = list2.next;
                list1.next = list2;
                list2.next = next1;
                list1 = next1;
                list2 = next2;
            }
        }
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode front = null;
        ListNode back = null;
        ListNode curr = head;
        while(null != curr) {
            front = curr.next;
            curr.next = back;
            back = curr;
            curr = front;
        }

        return back;
    }
}
