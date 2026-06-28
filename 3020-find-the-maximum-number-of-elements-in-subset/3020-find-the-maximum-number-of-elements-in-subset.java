class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int x : nums)
            mp.put(x, mp.getOrDefault(x, 0) + 1);

        Arrays.sort(nums);

        int ans = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            int curr = nums[i];
          
            int count = 1;

            while (curr != 1) {

                double root = Math.sqrt(curr);

                if (root != (int) root)
                    break;

                int next = (int) root;

                if (!mp.containsKey(next))
                    break;

                if (mp.get(next) < 2)
                    break;

               
                 count += 2;
                
                curr = next;
            }

            ans = Math.max(ans, count);
        }
        int mid=0;
        if (mp.containsKey(1)) {
            int ones = mp.get(1);

            if (ones % 2 == 0)
                mid = ones - 1;
            else
                mid = ones;
        }

        if(mid>ans) return mid;
        return ans;
    }
}