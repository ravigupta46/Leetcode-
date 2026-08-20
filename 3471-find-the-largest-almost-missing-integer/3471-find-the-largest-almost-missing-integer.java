class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<=n-k;i++){
            Set<Integer> seen=new HashSet<>();
            for(int j=i;j<i+k;j++){
                if(!seen.contains(nums[j])){
                     mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
                     seen.add(nums[j]);
                }
               
            }
        }
        int ans=-1;

        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()==1){
                ans=Math.max(ans,e.getKey());
            }
        }
        return ans;
        
    }
}