//my solution 

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[101];

        for (int num : nums) {
            result[num]++;
        }
        for (int i = 1; i < result.length; i++) {
            result[i] += result[i - 1];
        }
        int ans[] = new int[n];
        for (int i = 0; i < ans.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = result[nums[i] - 1];
            }

        }
        return ans;
    }
}