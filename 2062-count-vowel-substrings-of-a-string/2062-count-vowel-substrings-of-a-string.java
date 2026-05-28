class Solution {
    public boolean containsvowel(String s){
      for(char c:s.toCharArray()){
        if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')){
            return false;
        }
        if(!s.contains("a")) return false;
        if(!s.contains("e")) return false;
        if(!s.contains("i")) return false;
        if(!s.contains("o")) return false;
        if(!s.contains("u")) return false;
      }
      return true;
    }
    public int countVowelSubstrings(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                String str=word.substring(i,j);
                if(str.length()<5) continue;
                if(containsvowel(str)) count++;
            }
        }
        return count;
    }
}