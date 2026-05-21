class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1; 
        }
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int maxlen=0;
        for(int i=0;i<prefix.length;i++){
            int num=prefix[i];
            if(!mp.containsKey(num)){
                mp.put(num,i);
            }
            else{
                maxlen=Math.max(i-mp.get(num),maxlen);
            }
        }
        return maxlen;
    }
}