class Solution {
public:

    int solveUsingRecursion(vector<int>& nums,int curr,int prev){
        if(curr>=nums.size()){
            return 0;
        }
        int include=0;
        if(prev==-1||nums[curr]>nums[prev]){
            include=1+solveUsingRecursion(nums,curr+1,curr);
        }
        int exclude=0+solveUsingRecursion(nums,curr+1,prev);
        int ans=max(include,exclude);
        return ans;
    }

    int solveUsingMem(vector<int>&nums,int curr,int prev,vector<vector<int>> &dp){
        if(curr>=nums.size()){
            return 0;
        }

        //if ans already exists
        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }
        int include=0;
        if(prev==-1||nums[curr]>nums[prev]){
            include=1+solveUsingMem(nums,curr+1,curr,dp);
        }
        int exclude=0+solveUsingMem(nums,curr+1,prev,dp);
        dp[curr][prev+1]=max(include,exclude);
        return dp[curr][prev+1];
    }
    int solveUsingTabulation(vector<int>& nums){
        int n=nums.size();  
        vector<vector<int>> dp(n+1,vector<int>(n+1,0));
        for(int curr_index=n-1;curr_index>=0;curr_index--){
            for(int prev_index=curr_index-1;prev_index>=-1;prev_index--){
                int include=0;
                if(prev_index==-1||nums[curr_index]>nums[prev_index]){
                    include=1+dp[curr_index+1][curr_index+1];  //why curr_index+1 in both cells- prev ab wo nhi raha include kiya hai to aage bhi badhe ga
                }
                int exclude=0+dp[curr_index+1][prev_index+1];
                dp[curr_index][prev_index+1]=max(include,exclude);
            }
        }
        return dp[0][0];
    }

    int solveUsingTabulationSO(vector<int> &nums){
        int n=nums.size();
        vector<int> curr(n+1,0);
        vector<int> next(n+1,0);

        for(int curr_index=n-1;curr_index>=0;curr_index--){
            for(int prev_index=curr_index-1;prev_index>=-1;prev_index--){
                int include=0;
                if(prev_index==-1||nums[curr_index]>nums[prev_index]){
                    include=1+next[curr_index+1]; 
                }
                int exclude=0+next[prev_index+1];
              curr[prev_index+1]=max(include,exclude);
            }
            //aage badhana
            next=curr;
        }
        return next[0];
    }
    int solveUsingBS(vector<int>&nums){
        vector<int> ans;

        ans.push_back(nums[0]);
        for(int i=1;i<nums.size();i++){
            if(nums[i]>ans.back()){
                ans.push_back(nums[i]);
            }
           else{
             //jo just bada hai usska index nikalo aur uske jagah push karo
            int index=lower_bound(ans.begin(),ans.end(),nums[i])-ans.begin();
            //replace
            ans[index]=nums[i];
           }
        }
     return ans.size();
    }

    int lengthOfLIS(vector<int>& nums) {
        int curr=0;
        int prev=-1;
        // int ans=solveUsingRecursion(nums,curr,prev);
        // return ans;

        // int n=nums.size();
        // vector<vector<int>> dp(n+1,vector<int>(n+1,-1));
        // int ans=solveUsingMem(nums,curr,prev,dp);
        // return ans;


        // int ans=solveUsingTabulation(nums);
        // return ans;

        // int ans=solveUsingTabulationSO(nums);
        // return ans;

        int ans=solveUsingBS(nums);
            return ans;
        }

    
};
