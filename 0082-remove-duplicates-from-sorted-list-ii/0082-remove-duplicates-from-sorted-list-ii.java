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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null; 

        ListNode ans = new ListNode(0); 
        ListNode currentNode = ans;    
        ListNode dummy = head;         

        while (dummy != null && dummy.next != null) {
            int curr = dummy.val;
            int next = dummy.next.val;

            if (curr == next) {
                while (dummy.next != null && dummy.val == dummy.next.val) {
                    dummy = dummy.next;
                }
                dummy = dummy.next; 
            } else {
                currentNode.next = new ListNode(curr);
                currentNode = currentNode.next;
                dummy = dummy.next;
            }
        }
        if (dummy != null) {
            currentNode.next = new ListNode(dummy.val);
        }

        return ans.next; 
    }
}