class Solution {
    public boolean check(int[] a,int[] b){
        return b[0] > a[0] && b[1] > a[1];
    }

    public int solve(int curr,int prev,int[][] envelopes,int[][] dp){
        if(curr>=envelopes.length){
            return 0;
        }

        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }

        int exclude = solve(curr+1, prev, envelopes, dp);

        int include = 0;
        if(prev==-1 || check(envelopes[prev], envelopes[curr])){
            include = 1 + solve(curr+1, curr, envelopes, dp);
        }

        return dp[curr][prev+1] = Math.max(include, exclude);
    }
   
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;

        int[][] dp = new int[n][n+1];
        for(int[] d : dp){
            Arrays.fill(d, -1);
        }

        Arrays.sort(envelopes, (a, b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return b[1] - a[1];
        });

        return solve(0, -1, envelopes, dp);
    }
}