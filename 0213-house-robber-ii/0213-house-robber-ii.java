class Solution {

    public int solve(int idx, int[] nums, int[] dp) {
        if (idx < 0) return 0;
        if (idx == 0) return nums[0];

        if (dp[idx] != -1)
            return dp[idx];

        int steal = nums[idx] + solve(idx - 2, nums, dp);
        int leave = solve(idx - 1, nums, dp);

        return dp[idx] = Math.max(steal, leave);
    }

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] first = new int[n - 1];
        int[] second = new int[n - 1];

        for (int i = 0; i < n - 1; i++)
            first[i] = nums[i];

        for (int i = 1; i < n; i++)
            second[i - 1] = nums[i];

        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int ans1 = solve(first.length - 1, first, dp1);
        int ans2 = solve(second.length - 1, second, dp2);

        return Math.max(ans1, ans2);
    }
}