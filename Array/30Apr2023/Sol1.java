class Solution {
    static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            k = k % n;
        }
        int[] ans = new int[n];
        for (int i = 0; i < k; i++) {
            ans[i] = nums[n - k + i];
        }
        int index = 0;
        for (int i = k; i < n; i++) {
            ans[i] = nums[index];
            index++;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }

        return ans;
    }
}