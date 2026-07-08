class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int n=nums.length;
        int right=n-1;
        int mid=0;

        while(mid<=right){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
                
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[right];
                nums[right]=nums[mid];
                nums[mid]=temp;
                right--;
            }
        }

    }
}