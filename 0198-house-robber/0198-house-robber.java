class Solution {
    public int solve(int idx,int[] nums,int[] dp){
        if(idx<0) return 0;
        if(idx==0) return nums[0];
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int steal=nums[idx]+solve(idx-2,nums,dp);
        int leave=solve(idx-1,nums,dp);
        dp[idx]= Math.max(steal,leave);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int ans=solve(nums.length-1,nums,dp);
        return ans;
    }
}