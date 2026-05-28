class Solution {
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
    public long countVowels(String word) {
        long count = 0;
        int n=word.length();
       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if(isVowel(ch)){
            count+=(long)(i+1)*(n-1-i+1);
        }
       }
        return count;
    }
}