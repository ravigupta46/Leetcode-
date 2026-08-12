class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int ans=0;

        int left=0;
        int right=0;
        int n=nums.length;

        while(right<n){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.get(nums[right])>k){
               
                    mp.put(nums[left],mp.get(nums[left])-1);
                
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
        
    }
}