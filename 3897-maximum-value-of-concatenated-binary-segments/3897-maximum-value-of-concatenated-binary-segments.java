import java.util.*;

class Solution {
    public int maxValue(int[] nums1, int[] nums0) {
        int MOD = 1_000_000_007;
        int n = nums1.length;

        int[][] seg = new int[n][2];
        for (int i = 0; i < n; i++) {
            seg[i][0] = nums1[i];
            seg[i][1] = nums0[i];
        }

        Arrays.sort(seg, (a, b) -> {
            // A before B when: (2^a1-1)*2^a0*(2^b0-1) > (2^b1-1)*2^b0*(2^a0-1)
            // Take log: log(2^a1-1) + a0*ln2 + log(2^b0-1)
            //        vs log(2^b1-1) + b0*ln2 + log(2^a0-1)
            double lhs = log2xMinus1(a[0]) + a[1] * Math.log(2) + log2xMinus1(b[1]);
            double rhs = log2xMinus1(b[0]) + b[1] * Math.log(2) + log2xMinus1(a[1]);
            return Double.compare(rhs, lhs); // descending
        });

        long ans = 0;
        for (int[] s : seg) {
            int ones = s[0], zeros = s[1];
            for (int i = 0; i < ones; i++)  ans = (ans * 2 + 1) % MOD;
            for (int i = 0; i < zeros; i++) ans = (ans * 2)     % MOD;
        }

        return (int) ans;
    }

    // log(2^x - 1): exact for x<=50, approximate (x*ln2) for x>50
    private double log2xMinus1(int x) {
        if (x == 0) return Double.NEGATIVE_INFINITY;
        if (x > 50) return x * Math.log(2); // error < 2^-50, negligible
        return Math.log((1L << x) - 1);
    }
}