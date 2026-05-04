class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(0,-1);
    int sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        int remainder=sum%k;
        if(mp.containsKey(remainder)){
            if(i-mp.get(remainder)>1){
                return true;
            }
        }
        mp.putIfAbsent(remainder,i);
       }
        return false;
    }
}