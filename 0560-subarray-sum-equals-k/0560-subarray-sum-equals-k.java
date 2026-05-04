class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum-k)){
                count+=mp.get(sum-k);/// pichhe dekh raha hai ki kitni baar sum  wo_num=sum-k  ==== k=sum-wo_num so jitni baar wo number aayega utne subaaray banenege

            }

            
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}