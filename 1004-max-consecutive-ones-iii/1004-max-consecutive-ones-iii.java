class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            int j = i;
            int zeroCount = 0;

            while (j < n) {
                if (nums[j] == 0) zeroCount++;

                if (zeroCount > k) break;

                j++;
            }

            maxlen = Math.max(maxlen, j - i);
        }

        return maxlen;
    }
}