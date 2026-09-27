class Solution {

    class Pair {
        int zero;
        int ones;

        Pair(int zero, int ones) {
            this.zero = zero;
            this.ones = ones;
        }
    }

    int dp[][][];

    public int countzero(String s) {
        int zeroes = 0;

        for(char c : s.toCharArray()) {
            if(c == '0') {
                zeroes++;
            }
        }

        return zeroes;
    }

    public int countone(String s) {
        int ones = 0;

        for(char c : s.toCharArray()) {
            if(c == '1') {
                ones++;
            }
        }

        return ones;
    }

    public int solve(List<Pair> li, int idx, int m, int n) {

        // Base case
        if(idx >= li.size()) {
            return 0;
        }

        // Already calculated
        if(dp[idx][m][n] != -1) {
            return dp[idx][m][n];
        }

        Pair p = li.get(idx);

        // Exclude current string
        int exclude = solve(li, idx + 1, m, n);

        // Include current string
        int include = 0;

        if(p.zero <= m && p.ones <= n) {
            include = 1 + solve(
                li,
                idx + 1,
                m - p.zero,
                n - p.ones
            );
        }

        return dp[idx][m][n] = Math.max(include, exclude);
    }

    public int findMaxForm(String[] strs, int m, int n) {

        List<Pair> li = new ArrayList<>();

        for(String s : strs) {
            int zero = countzero(s);
            int one = countone(s);

            li.add(new Pair(zero, one));
        }

        int len = strs.length;

        dp = new int[len + 1][m + 1][n + 1];

        // Initialize DP with -1
        for(int i = 0; i <= len; i++) {
            for(int j = 0; j <= m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(li, 0, m, n);
    }
}