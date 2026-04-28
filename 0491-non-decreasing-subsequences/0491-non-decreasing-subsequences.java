class Solution {
    Set<List<Integer>> set=new HashSet<>();
    public void backt(List<List<Integer>> ans,List<Integer> li,int[] nums,int idx){
       
        
         if (li.size() >= 2) {
            List<Integer> temp = new ArrayList<>(li);
            if (!set.contains(temp)) {
                set.add(temp);
                ans.add(temp);
            }
        }
         if(idx==nums.length){
            return;
        }
        if(li.size()==0|| nums[idx]>=li.get(li.size()-1)){
            li.add(nums[idx]);
             backt(ans,li,nums,idx+1);
            li.remove(li.size()-1);
        }
       
        backt(ans,li,nums,idx+1);
  
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        backt(ans,li,nums,0);
        return ans;
    }
}