//my solution

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode aadi = new ListNode();
        aadi.next = head;
        ListNode curr = aadi;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }

        }
        return aadi.next;
    }
}