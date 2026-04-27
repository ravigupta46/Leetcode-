import java.util.*;

class Solution {
    public String sortVowels(String s) {

        Map<Character,Integer> mp = new HashMap<>();
        Map<Character,Integer> first = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                mp.put(c, mp.getOrDefault(c,0)+1);
                first.putIfAbsent(c, i);
            }
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->{
            if(!mp.get(a).equals(mp.get(b))){
                return mp.get(b) - mp.get(a);
            }
            return first.get(a) - first.get(b);
        });

        pq.addAll(mp.keySet());

        List<Character> sorted = new ArrayList<>();

        while(!pq.isEmpty()){
            char c = pq.poll();
            int freq = mp.get(c);

            while(freq-- > 0){
                sorted.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.append(sorted.get(idx++));
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}