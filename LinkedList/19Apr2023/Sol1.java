//my solution 

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode();
        res.next = head;
        ListNode pre = res;
        ListNode p1 = head;
        while (p1 != null && p1.next != null) {
            ListNode p2 = p1.next;
            p1.next = p2.next;
            p2.next = p1;
            pre.next = p2;
            pre = p1;
            p1 = p1.next;
        }
        return res.next;
    }
}