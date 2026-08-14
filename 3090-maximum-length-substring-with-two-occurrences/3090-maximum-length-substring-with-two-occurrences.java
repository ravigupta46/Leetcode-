class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int right=0;
        int ans=0;
        Map<Character,Integer> mp=new HashMap<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>2){
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
            
            right++;
        }
        return ans;
    }
}