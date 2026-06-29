class Solution {
    public int atmostodd(int[]nums,int k){
        int left=0;
        int oddcount=0;
        int res=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1) oddcount++;
            while(oddcount>k){
                if(nums[left]%2==1){
                    oddcount--;
                    
                }
                left++;
                
            }
            res+=right-left+1;
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostodd(nums,k)-atmostodd(nums,k-1);
        
    }
}