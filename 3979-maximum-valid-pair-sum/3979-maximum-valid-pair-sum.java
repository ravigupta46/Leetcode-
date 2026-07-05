class Solution {
    public int maxValidPairSum(int[] nums, int k) {
         int ans = Integer.MIN_VALUE;
        int maxLeft = nums[0];
        for (int j = k; j < nums.length; j++) {
            ans = Math.max(ans, maxLeft + nums[j]);
            maxLeft = Math.max(maxLeft, nums[j - k + 1]);
        }
        return ans;
    }
}