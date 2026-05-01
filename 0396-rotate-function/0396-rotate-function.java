class Solution {
    public int maxRotateFunction(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
         int j=0;
         int ans=0;
         int k=i;
            while(j<n){
                ans+=nums[k%n]*j;
                j++;
                k++;
            }
         maxi=Math.max(maxi,ans);
        }
        return maxi;
        
    }
}