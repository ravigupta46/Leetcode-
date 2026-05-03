class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char c=s.charAt(0);
        
        int i=1;
        StringBuilder sb=new StringBuilder();
        sb.append(c);
        
       while(i<s.length() && s.charAt(i)!=c){
        sb.append(s.charAt(i));
        i++;
        
       }
       String key=sb.toString();
     int slen=s.length();
     int keylen=key.length();
     if(slen%keylen!=0){
        return false;
     }
       for(int j=i;j<s.length()-i+1;j=j+i){
        if(!s.substring(j,j+i).equals(key)){
            return false;
        }
       }
       return true;
    }
}