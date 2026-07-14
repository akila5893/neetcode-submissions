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
        if(head == null) {
            return null;
        }
        if(head.next == null && n ==1) {
            head = null;
            return head;
        }
        ListNode temp = head,prev = head;
        int counter = 0;
        while(temp != null) {
            temp = temp.next;
            counter++;
        }
        n = counter - n;
        int i=0;
        temp = head;
        if(i == n) {
            head = head.next;
        } else {
            while(i < n) {
                prev=temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
        }

        return head;
    }
}
