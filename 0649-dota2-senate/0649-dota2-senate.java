class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> dire=new LinkedList<>();
        Queue<Integer> radi=new LinkedList<>();
    int n=senate.length();
        for(int i=0;i<n;i++){
            char c=senate.charAt(i);
            if(c=='R'){
                radi.offer(i);
            }
            else{
                dire.offer(i);
            }
        }

        while(!dire.isEmpty() && !radi.isEmpty()){
            int d=dire.poll();
            int r=radi.poll();

            if(d<r){
                dire.offer(n++);
            }
            else{
                radi.offer(n++);
            }
        }
        if(dire.isEmpty()){
            return "Radiant";
        }
        
            return "Dire";


    }
}