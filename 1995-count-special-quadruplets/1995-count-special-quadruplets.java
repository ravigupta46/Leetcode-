class Solution {
    public int countQuadruplets(int[] nums) {
       int n=nums.length;
       int ans=0;
       for(int i=3;i<n;i++){
        for(int j=2;j<i;j++){
            for(int k=1;k<j;k++){
                for(int l=0;l<k;l++){
                    if(nums[i]==nums[j]+nums[k]+nums[l]){
                        ans++;
                    }
                }
            }
        }
        }
        return ans;
    }
}