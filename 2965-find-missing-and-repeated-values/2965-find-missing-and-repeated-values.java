class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mp.put(grid[i][j], mp.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        for (int i = 0; i < m * n; i++) {
            if (!mp.containsKey(i + 1)) {
                ans[1] = i + 1;
            } else {
                if (mp.get(i + 1) > 1) {
                    ans[0] = i + 1;
                }
            }
        }
        return ans;

    }
}