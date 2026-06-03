class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int firstsum = Integer.MAX_VALUE;
        int secondsum = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            int sum = landStartTime[i] + landDuration[i];
            firstsum = Math.min(sum, firstsum);
        }
        for (int j = 0; j < waterStartTime.length; j++) {
            int finalsum = waterDuration[j] + Math.max(firstsum, waterStartTime[j]);
            ans = Math.min(finalsum, ans);
        }

        for (int i = 0; i < waterStartTime.length; i++) {
            int sum = waterStartTime[i] + waterDuration[i];
            secondsum = Math.min(secondsum, sum);
        }
        for (int j = 0; j < landStartTime.length; j++) {
            int finalsum = landDuration[j] + Math.max(secondsum, landStartTime[j]);
            ans = Math.min(ans, finalsum);
        }

        return ans;
    }
}