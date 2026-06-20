class Solution {
    public int totalFruit(int[] nums) {
        int right = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int left = 0;
        int maxcount = 0;

        while (right < n) {
            int a = nums[right];

            mp.put(a, mp.getOrDefault(a, 0) + 1);

            while (mp.size() > 2) {
                mp.put(nums[left], mp.get(nums[left]) - 1);

                if (mp.get(nums[left]) == 0)
                    mp.remove(nums[left]);

                left++;
            }

            maxcount = Math.max(maxcount, right - left + 1);

            right++;
        }

        return maxcount;
    }
}