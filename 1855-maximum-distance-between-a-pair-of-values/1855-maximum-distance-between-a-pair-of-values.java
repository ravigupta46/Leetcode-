class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int gap=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int key=nums1[i];
            int end=nums2.length-1;
            int start=i;
           while(start<=end){
            int mid=(start+end)/2;
            if(nums2[mid]>=key){
                gap=Math.max(gap,mid-i);
                start=mid+1;
            }
            else{
                end=mid-1;
            }
           }
        }
        if(gap==Integer.MIN_VALUE) return 0;
        return gap;
    }
}