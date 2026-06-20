class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxlen = 0;
        int right = 0;
        int zeroCount=0;
        int left = 0;
        while (right < n) {
            if (nums[right] == 0)
                zeroCount++;
            if(zeroCount>k){
                while(zeroCount>k){
                    if(nums[left]==0){
                        zeroCount--;
                    }
                    left++;
                }
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;

        }

        return maxlen;
    }
}