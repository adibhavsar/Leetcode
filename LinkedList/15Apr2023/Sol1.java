class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode last = head;

        while (last != null && last.next != null) {
            mid = mid.next;
            last = last.next.next;
        }

        return mid;
    }
}