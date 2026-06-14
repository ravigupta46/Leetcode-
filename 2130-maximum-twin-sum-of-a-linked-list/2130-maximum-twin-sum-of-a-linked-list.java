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
    public int pairSum(ListNode head) {
        List<Integer> li=new ArrayList<>();
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<li.size();i++){
            int sum=li.get(i)+li.get(li.size()-1-i);
            maxi=Math.max(sum,maxi);
        }
        return maxi;
        
    }
}