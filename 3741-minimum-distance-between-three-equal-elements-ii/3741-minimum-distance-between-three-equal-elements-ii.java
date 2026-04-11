class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{-1, -1});
            }

            int[] arr = map.get(nums[i]);
            if (arr[0] != -1) {
                mini = Math.min(mini, 2 * (i - arr[0]));
            }
            arr[0] = arr[1];
            arr[1] = i;

          
        }

        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
}