class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int n=nums.length;
        int end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mid%2==0){
                if(mid>0 && nums[mid]==nums[mid-1]){
                    end=mid-1;
                }
                else if(mid<n-1 && nums[mid]==nums[mid+1]){
                    start=mid+1;
                }
                else if(mid==0 && nums[mid+1]!=nums[mid]) return nums[mid];
                else if(mid==n-1 && nums[mid]!=nums[mid-1]) return nums[mid];
                else if(nums[mid]!=nums[mid-1]&& nums[mid]!=nums[mid+1]){
                    return nums[mid];
                }
            }
            else{
               if(mid>0 && nums[mid]==nums[mid-1]){
                  start=mid+1;
                }
                else if(mid<n-1 && nums[mid]==nums[mid+1]){
                     end=mid-1;
                }
          
            }
        }
        return nums[start];
    }
}