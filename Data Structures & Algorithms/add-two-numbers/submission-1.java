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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode l1temp = l1;
        ListNode l2temp = l2;
        int carry=0,longest=0,i=0;
        String s = "";

        while(l1temp!=null && l2temp!=null) {
            int sum = l1temp.val+l2temp.val+carry;
            carry=0;
            if(sum > 9) {
                int n = sum%10;
                carry = sum/10;
                s+=n;
            }else {
                s+=sum;
            }
            l1temp = l1temp.next;
            l2temp = l2temp.next;
        }

        if(l1temp!=null) {
            while(l1temp!=null) {
                int sum = l1temp.val+carry;
                carry=0;
                if(sum > 9) {
                    int n = sum%10;
                    carry = sum/10;
                    s+=n;
                }else {
                    s+=sum;
                }
                l1temp = l1temp.next;
            }
            longest=1;
        }
        if(l2temp!=null) {
            while(l2temp!=null) {
                int sum = l2temp.val+carry;
                carry=0;
                if(sum > 9) {
                    int n = sum%10;
                    carry = sum/10;
                    s+=n;
                }else {
                    s+=sum;
                }
                l2temp = l2temp.next;
            }
            longest=2;
        }
        s+=carry;
        if(longest==1) {
            head=l1;
        }else {
            head=l2;
        }
        ListNode temp=head,prev=head;
        while(temp!=null && i<s.length()) {
            prev=temp;
            temp.val=s.charAt(i++) - '0';
            temp=temp.next;
        }

        if(i<s.length() && s.charAt(i) - '0' !=0) {
            ListNode newnode = new ListNode(s.charAt(i++) - '0',null);
            prev.next=newnode;
        }
        return head;
    }
}
