class Solution {
    public ListNode middleNode(ListNode head) {
        int c = 0;
        ListNode curr = head;
        while (curr != null) {
            c++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 1; i <= c; i++) {
            if (i == (c / 2)) {
                return curr.next;
            }
            curr = curr.next;
        }
        return head;
    }
}