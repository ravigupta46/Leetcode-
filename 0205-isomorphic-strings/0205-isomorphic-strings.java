class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(!mp.containsKey(c1)){
                mp.put(c1,c2);
            }
            if(mp.get(c1)!=c2) return false;
        }

        Map<Character,Character> mp2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=t.charAt(i);
            char c2=s.charAt(i);
            if(!mp2.containsKey(c1)){
                mp2.put(c1,c2);
            }
            if(mp2.get(c1)!=c2) return false;
        }
        return true;
    }

}