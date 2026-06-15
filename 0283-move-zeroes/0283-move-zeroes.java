class Solution {
    public void moveZeroes(int[] nums) {
        
        
        int j=0;
        int zeroCount=0;
        for(int a:nums){
            if(a==0) zeroCount++;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }

    }
}