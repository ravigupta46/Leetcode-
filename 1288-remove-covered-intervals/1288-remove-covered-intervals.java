class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });

        int n = intervals.length;
        boolean[] covered = new boolean[n];

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

               
                if (intervals[i][0] <= intervals[j][0] &&
                    intervals[i][1] >= intervals[j][1]) {

                    covered[j] = true;
                }

                
                else if (intervals[j][0] <= intervals[i][0] &&
                         intervals[j][1] >= intervals[i][1]) {

                    covered[i] = true;
                }
            }
        }

        int ans = 0;
        for (boolean x : covered) {
            if (!x)
                ans++;
        }

        return ans;
    }
}