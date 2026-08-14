class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1' && vis[i][j] == false) {
                    bfs(i,j,grid,vis);
                    //dfs(i, j, grid, vis);
                    count++;
                }
            }
        }

        return count;
    }
    private void bfs(int i,int j,char[][] grid,boolean[][] vis){
        int m=grid.length;
        int n=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i, j});
        while(!q.isEmpty()){
            int []fr=q.poll();

            int row=fr[0];
            int col=fr[1];
            if (row > 0 &&
                grid[row - 1][col] == '1' &&
                !vis[row - 1][col]) {

                vis[row - 1][col] = true;
                q.add(new int[]{row - 1, col});
            }

            // DOWN
            if (row + 1 < m &&
                grid[row + 1][col] == '1' &&
                !vis[row + 1][col]) {

                vis[row + 1][col] = true;
                q.add(new int[]{row + 1, col});
            }

            // LEFT
            if (col > 0 &&
                grid[row][col - 1] == '1' &&
                !vis[row][col - 1]) {

                vis[row][col - 1] = true;
                q.add(new int[]{row, col - 1});
            }

            // RIGHT
            if (col + 1 < n &&
                grid[row][col + 1] == '1' &&
                !vis[row][col + 1]) {

                vis[row][col + 1] = true;
                q.add(new int[]{row, col + 1});
            }


        }

    }
    private void dfs(int i, int j, char[][] grid, boolean[][] vis) {
        int m=grid.length;
        int n=grid[0].length;

      

        
    

        vis[i][j] = true;

       

        // Up
        if (i > 0 && grid[i - 1][j] == '1' && !vis[i - 1][j]) {
            dfs(i - 1, j, grid, vis);
        }

        // Down
        if (i + 1 < m && grid[i + 1][j] == '1' && !vis[i + 1][j]) {
            dfs(i + 1, j, grid, vis);
        }

        // Left
        if (j > 0 && grid[i][j - 1] == '1' && !vis[i][j - 1]) {
            dfs(i, j - 1, grid, vis);
        }

        // Right
        if (j + 1 < n && grid[i][j + 1] == '1' && !vis[i][j + 1]) {
            dfs(i, j + 1, grid, vis);
        }
        
    }

}