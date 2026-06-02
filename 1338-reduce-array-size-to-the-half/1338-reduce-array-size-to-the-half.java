class Solution {
    class Pair{
        int ele;
        int freq;
        Pair(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
    }
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int a:arr){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
        int n=arr.length;
        int count=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            Pair p=new Pair(e.getKey(),e.getValue());
            pq.add(p);
        }
        int rem=n;
        while(!pq.isEmpty()){
            Pair fr=pq.poll();
            count++;
            int getfre=fr.freq;
            rem=rem-getfre;
            if((n/2)>=(rem)){
                break;
            }
        }
        return count;

    }
}