class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> st=new HashSet<>();
    public void getcombi(int idx, List<Integer> li, int[] nums, int target) {
       if(idx>=nums.length||target<0){
            return;
       }
        if (target == 0 && !st.contains(li)) {
           ans.add(new ArrayList<>(li));
            st.add(new ArrayList<>(li));
        }
        li.add(nums[idx]);
        getcombi(idx + 1, li,nums, target - nums[idx]);

        getcombi(idx, li,nums, target - nums[idx]);
        li.remove(li.size() - 1);
        getcombi(idx + 1,li, nums, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<Integer> li = new ArrayList<>();
        getcombi(0,li,candidates,target);
        return ans;

    }
}