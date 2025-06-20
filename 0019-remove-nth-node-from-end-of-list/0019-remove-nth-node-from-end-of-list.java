class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = head;
        ListNode dummy = head;


        for (int i = 0; i < n; i++) {
            if(res == null) return head;
            res = res.next;
        }

        if(res == null) return head.next;

        while (res.next != null) {
            res = res.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return head;
    }
}