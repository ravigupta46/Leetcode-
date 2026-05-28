class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void getcombi(int idx,
                         List<Integer> li,
                         int[] nums,
                         int target) {

        if(target == 0) {
            ans.add(new ArrayList<>(li));
            return;
        }

        if(idx >= nums.length || target < 0) {
            return;
        }

        // INCLUDE current element
        li.add(nums[idx]);

        getcombi(idx + 1,
                 li,
                 nums,
                 target - nums[idx]);

        li.remove(li.size() - 1);

        // SKIP duplicates before exclude
        while(idx + 1 < nums.length &&
              nums[idx] == nums[idx + 1]) {

            idx++;
        }

        // EXCLUDE current element
        getcombi(idx + 1,
                 li,
                 nums,
                 target);
    }

    public List<List<Integer>> combinationSum2(int[] candidates,
                                               int target) {

        Arrays.sort(candidates);

        List<Integer> li = new ArrayList<>();

        getcombi(0,
                 li,
                 candidates,
                 target);

        return ans;
    }
}