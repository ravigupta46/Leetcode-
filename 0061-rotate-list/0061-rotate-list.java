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

    public ListNode rotateRight(ListNode head, int k) {
        int length=0;
        
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode h1=head;
        while(h1!=null){
            length++;
            h1=h1.next;
        }
     k=k%length;
        while(k>0){
            ListNode temp=head;
            ListNode prev=new ListNode(-1);
            prev.next=temp;

            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
            k--;
        }
        return head;
    }
}