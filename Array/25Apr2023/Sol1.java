//my solution

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result[] = new int[2];
        while (left <= right) {
            if (nums[left] == target) {
                result[0] = left;
                while (left < right) {
                    if (nums[right] == target) {
                        result[1] = right;
                        return result;
                    } else {
                        right = right - 1;
                    }
                }
                result[1] = left;
                return result;
            } else if (nums[left] < target) {
                left = left + 1;
            } else if (nums[right] > target) {
                right = right - 1;
            }

        }

        return new int[] { -1, -1 };
    }
}