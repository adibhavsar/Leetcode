//my solution

class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;

        while (head != null) {
            sum = sum * 2;
            sum = sum + head.val;
            head = head.next;
        }
        return sum;
    }
}