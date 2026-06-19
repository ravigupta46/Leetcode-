class Solution {
    public int largestAltitude(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            nums[i]=sum;
        }
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(a>maxi){
                maxi=a;
               
            }
        }
        return Math.max(maxi,0);
    }
}