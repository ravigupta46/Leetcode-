class Solution {

    public int solve(int idx, int[] coins, int amount, int[][] dp) {

        if (amount == 0) {
            return 0;
        }

        if (idx == coins.length) {
            return (int)1e9;
        }

        if (dp[idx][amount] != -1) {
            return dp[idx][amount];
        }

        int exclude = solve(idx + 1, coins, amount, dp);

        int include = (int)1e9;

        if (coins[idx] <= amount) {

            include = 1 + solve(idx, coins, amount - coins[idx], dp);
        }

        return dp[idx][amount] = Math.min(include, exclude);
    }

    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[coins.length][amount + 1];

        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        int ans = solve(0, coins, amount, dp);

        return ans >= (int)1e9 ? -1 : ans;
    }
}