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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.next.val==val){
                ListNode temp2=temp;
                while(temp2!=null&&temp2.next!=null&&temp2.next.val==val){
                    temp2=temp2.next;
                }
               temp.next=temp2.next;
            }
            temp=temp.next;
        }
        if(head!=null&&head.val==val) return head.next;
        return head;
    }
}