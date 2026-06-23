class Solution {
    public String largestOddNumber(String s) {
        int i=s.length()-1;
        while(i>=0){
            int num=s.charAt(i)-'0';
            if((num&1)==1){
                return s.substring(0,i+1);
            }
            else{
                i--;
            }
        }
        return "";
    }
}