class Solution {
    public int chalkReplacer(int[] nums, int k) {
    int i=0;
    int n=nums.length;
    long sum=0;
    for(int a:nums) sum+=a;
    k=(int)(k%sum);
    while(k>=nums[i]){
        k=k-nums[i];
        i=(i+1)%n;
    }  
    return i;

    }
}