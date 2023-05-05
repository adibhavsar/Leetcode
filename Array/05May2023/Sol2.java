//my solution 

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length, k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                arr[k++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1)
                arr[k++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 2)
                arr[k++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}