class Solution {

    public int solve(int[] nums, int target, int idx, int j, int[][] dp) {

        if (idx == nums.length - 1) {
            return 0;
        }

        if (j >= nums.length) {
            return -(int)1e9;
        }

        if (dp[idx][j] != -1) {
            return dp[idx][j];
        }

        
        int notPick = solve(nums, target, idx, j + 1, dp);

        int pick = -(int)1e9;

        
        if (Math.abs(nums[j] - nums[idx]) <= target) {
            pick = 1 + solve(nums, target, j, j + 1, dp);
        }

        return dp[idx][j] = Math.max(pick, notPick);
    }

    public int maximumJumps(int[] nums, int target) {

        int n = nums.length;

        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solve(nums, target, 0, 1, dp);

        return ans < 0 ? -1 : ans;
    }
}