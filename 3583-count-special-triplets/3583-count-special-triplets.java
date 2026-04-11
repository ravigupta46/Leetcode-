import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int n = nums.length;
        
        Map<Integer, Integer> right = new HashMap<>();
        for (int x : nums) right.merge(x, 1, Integer::sum);
        
        Map<Integer, Integer> left = new HashMap<>();
        long ans = 0;
        
        for (int j = 0; j < n; j++) {
            int v = nums[j];
            right.merge(v, -1, Integer::sum);
            
            int need = v * 2;
            long l = left.getOrDefault(need, 0);
            long r = right.getOrDefault(need, 0);
            
            ans = (ans + l * r) % MOD;
            
            left.merge(v, 1, Integer::sum);
        }
        
        return (int) ans;
    }
}