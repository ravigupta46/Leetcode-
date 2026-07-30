class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n=adj.size();
        boolean[] vis=new boolean[n];
        vis[0]=true;
        bfs(0,vis,adj);
        for(boolean e:vis){
            if(e==false) return false;
        }
        return true;
    }
    public void bfs(int start,boolean[] vis,List<List<Integer>> adj){
        int n=adj.size();
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int fr=q.poll();
          
            for(int ele:adj.get(fr)){
                if(vis[ele]==false){
                    vis[ele]=true;
                    q.add(ele);
                }

            }
        }

    }
}