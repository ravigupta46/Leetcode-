class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int gap=Integer.MAX_VALUE;
        int n=nums.length;
        int ans=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int key=nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=key+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans=Math.abs(target-sum);
                }
                if(sum>target){
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    return sum;
                }
               
            }
        }
        return ans;
    }
}