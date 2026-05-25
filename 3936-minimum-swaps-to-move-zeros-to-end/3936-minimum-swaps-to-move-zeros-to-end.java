class Solution {
    public int minimumSwaps(int[] nums) {
        int zeroCount=0;
        for(int a:nums){
            if(a==0) zeroCount++;
        }
        int count=0;
        for(int i=nums.length-1;i>=nums.length-zeroCount;i--){
            if(nums[i]!=0) count++;
        }
        return count;


    }
}