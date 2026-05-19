class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int minans=Integer.MAX_VALUE;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                minans=Math.min(minans,nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
            
        }
        if(minans==Integer.MAX_VALUE) return -1;
        return minans;
    }
}