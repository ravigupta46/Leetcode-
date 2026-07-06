class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> st = new HashSet<>();

    public void getallCombi(List<Integer> li, int[] nums, int idx) {
        if (idx > nums.length)
            return;

        if (idx == nums.length) {
            if (!st.contains(li)) {
                st.add(new ArrayList<>(li));
                ans.add(new ArrayList<>(li));
            }

            return;
        }
        li.add(nums[idx]);
        getallCombi(li, nums, idx + 1);
        li.remove(li.size() - 1);
        getallCombi(li, nums, idx + 1);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Arrays.sort(nums);
        getallCombi(li, nums, 0);
        return ans;
    }
}