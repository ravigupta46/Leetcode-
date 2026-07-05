class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int key=nums[n/2];
        for(int i=0;i<n;i++){
            if(i!=n/2){
                if(nums[i]==key) return false;
            }
        }
        return true;
    }
}