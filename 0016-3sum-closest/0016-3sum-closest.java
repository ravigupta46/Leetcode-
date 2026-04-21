class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int gap=Integer.MAX_VALUE;
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n-2;i++){
            int key=nums[i];
            for(int j=i+1;j<n-1;j++){
                int key2=nums[j];
                for(int k=j+1;k<n;k++){
                    int sum=key+key2+nums[k];
                    if(Math.abs(target-sum)<gap){
                        gap=Math.abs(target-sum);
                        ans=sum;
                    }
                }
            }
        }
        return ans;
    }
}