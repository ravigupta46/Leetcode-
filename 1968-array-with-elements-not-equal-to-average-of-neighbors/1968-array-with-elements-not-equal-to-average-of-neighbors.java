class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int[] temp=nums.clone();
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            nums[i]=temp[k];
            k++;
        }
        for(int i=1;i<n;i=i+2){
            nums[i]=temp[k];
            k++;
        }
        return nums;

    }
}