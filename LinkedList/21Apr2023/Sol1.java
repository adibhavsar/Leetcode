//my solution

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        if (head == null || head.next == null)
            return false;

        while (true) {
            if (fast.next == null || fast.next.next == null)
                break;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}