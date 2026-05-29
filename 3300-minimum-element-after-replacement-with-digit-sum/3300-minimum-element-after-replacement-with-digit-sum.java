class Solution {
    public int findsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ele=findsum(nums[i]);
            mini=Math.min(ele,mini);
        }
        return mini;
    }
}