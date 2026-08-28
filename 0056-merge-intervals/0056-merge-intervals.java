class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> ans = new ArrayList<>();
        if (intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

       
            ans.add(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {

            int[] curr = intervals[i];
            int[] prev = ans.get(ans.size() - 1);

            
            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1], curr[1]);
            }

       
            else {
                ans.add(curr);
            }
        }
        int[][] fans = new int[ans.size()][2];
        for (int i = 0; i < fans.length; i++) {
            fans[i] = ans.get(i);
        }
        return fans;

    }
}