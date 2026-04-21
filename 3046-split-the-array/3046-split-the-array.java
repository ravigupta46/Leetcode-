class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int maxF=Integer.MIN_VALUE;
    int count=0;
    int mark=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet() ){
            if(e.getValue()>maxF){
                maxF=e.getValue();
               
            }
            if(e.getValue()>=nums.length/2){
                if(mark==0){
                mark=e.getKey();
                count++;
                }
                else if(e.getKey()==mark){
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        if(maxF==nums.length){
            return false;
        }
        if(count>1) return false;
        return true;

    }
}