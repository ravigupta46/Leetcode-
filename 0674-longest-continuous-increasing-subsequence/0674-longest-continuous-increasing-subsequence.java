class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int prev=-1;
        int curr=0;
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr=i;
            if(prev==-1||nums[prev]<nums[curr]){
                count++;
                maxCount=Math.max(count,maxCount);    
            }
            else{
                count=1;
            }
            prev=curr;
        }
        return maxCount;
    }
}