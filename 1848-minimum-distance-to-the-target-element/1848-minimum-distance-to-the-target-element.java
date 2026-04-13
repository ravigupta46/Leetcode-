class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int idx=0;
        int mingap=Integer.MAX_VALUE;
        while(idx<nums.length){
            if(nums[idx]==target){
                mingap=Math.min(Math.abs(idx-start),mingap);
            }
            idx++;
        }
        return mingap;
    }
}