class Solution {
    public boolean validPath(int n, int[][] edges, int start, int destination) {
        if(start==destination) return true;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            adj.add(list);
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis=new boolean[n];
        vis[start]=true;
        bfs(start,adj,vis,destination);
        return vis[destination];
    }
    public void bfs(int start,List<List<Integer>> adj,boolean[] vis,int destination){
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int fr=q.poll();
            for(int e:adj.get(fr)){
                if(vis[e]==false){
                    vis[e]=true;
                    q.add(e);
                    if(e==destination) return;
                }

            }
        }

    }
}