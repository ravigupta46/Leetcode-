class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        int stopper=Integer.MAX_VALUE;
        int ans=1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]<=stopper){
                stopper=Math.min(stopper,points[i][1]);
            }
            else{
                stopper=points[i][1];
                ans++;
            }

        }
        return ans;
        
    }
}