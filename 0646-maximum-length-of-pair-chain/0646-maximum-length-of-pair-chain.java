class Solution {
  
    public int memo(int curr,int prev,int[][] pairs,int[][] dp){
        if(curr>=pairs.length){
            return 0;
        }
        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }
        int exclude=0+memo(curr+1,prev,pairs,dp);
        int include=0;
        if(prev==-1||pairs[prev][1]<pairs[curr][0]){
            include=1+memo(curr+1,curr,pairs,dp);
        }
        dp[curr][prev+1]=Math.max(include,exclude);
        return dp[curr][prev+1];
    }
    public int findLongestChain(int[][] pairs) {
       
        Arrays.sort(pairs,(a,b)->{
         return a[0]-b[0];
        });
        int[][] dp=new int[pairs.length][pairs.length+1];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        int ans=memo(0,-1,pairs,dp);
        return ans;

        
    }
}