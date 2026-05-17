class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int prev=(int)s.charAt(i);
            int curr=(int)s.charAt(i+1);
            if(Math.abs(curr-prev)>2) return false;
        }
        return true;
        
    }
}