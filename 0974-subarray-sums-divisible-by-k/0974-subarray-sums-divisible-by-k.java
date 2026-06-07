class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int count=0;
        for(int i=0;i<n;i++){
            int ele=prefix[i]%k;
            if(ele<0){
                ele+=k;
            }
            if(mp.containsKey(ele)){
                count+=mp.get(ele);
            }
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        return count;

    }
}