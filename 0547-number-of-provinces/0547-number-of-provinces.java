class Solution {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                //dfs(i,visited,adj);
                bfs(i,visited,adj);
                count++;
            }
        }
        return count;
        
    }
    public void bfs(int i,boolean[] visited,int[][] adj){

        Queue<Integer> q=new LinkedList<>();
        int n=adj.length;
        q.offer(i);

        while(q.size()>0){
            int fr=q.poll();
           
            for(int j=0;j<n;j++){
                if(visited[j]==false && adj[fr][j]==1){
                    visited[j]=true;
                    q.offer(j);
                }
            }
        }

    }

   
}