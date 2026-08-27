class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int stopper=intervals[0][1];
        int ans=0;

        for(int i=1;i<intervals.length;i++){
            int[]arr=intervals[i];
             if (arr[0] < stopper) {
                ans++;
                stopper = Math.min(stopper, arr[1]);
            } else {
                stopper = arr[1];
            }
        }
        return ans;
        
    }
}