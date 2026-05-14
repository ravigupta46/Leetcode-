class Solution {
    public boolean isGood(int[] nums) {
       int n=nums.length;
        Arrays.sort(nums);
        int[] base=new int[nums[n-1]+1];
        if(base.length!=n) return false;
        for(int i=0;i<base.length;i++){
            if(i==n-2||i==n-1) base[i]=n-1;
            else{
                base[i]=i+1;
            }
        }
        for(int i=0;i<n;i++){
            if(base[i]!=nums[i]) return false;
        }
        return true;
    }
}