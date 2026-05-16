class Solution {

    public int solve(int idx,int target,int[] nums,int[][] dp,int sum){
        if(idx==nums.length){
            if(target==0) return 1;
            else return 0;
        }
        if (target + sum < 0 || target + sum >= 2 * sum + 1) {
            return 0;
        }
        if(dp[idx][target+sum]!=-1) return dp[idx][target+sum];

        int add=solve(idx+1,target+nums[idx],nums,dp,sum);
        int sub=solve(idx+1,target-nums[idx],nums,dp,sum);

        dp[idx][target+sum]=add+sub;
        return dp[idx][target+sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;

        for(int a:nums){
            sum+=a;
        }
        int[][] dp=new int[nums.length][2*sum+1];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        int ans=solve(0,target,nums,dp,sum);
        return ans;
    }
}