class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int maxF = 0;
        int right = 0;
        int left = 0;
        int countT=0;
        int countF=0;
        int maxlen=0;
        int n=s.length();
        while (right < n) {
            if(s.charAt(right)=='T') countT++;
            else countF++;

            maxF=Math.max(countT,countF);
            int len=right-left+1;

            while((right-left+1)-maxF>k){
                if(s.charAt(left)=='T') countT--;
                else countF--;
                left++;
            }
            maxlen=Math.max(right-left+1,maxlen);
            right++;
        }
        return maxlen;
    }
}