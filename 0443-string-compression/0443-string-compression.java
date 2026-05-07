class Solution {
    public int compress(char[] chars) {
       int n=chars.length; 
       int i=0;
       int j=0;
       if(n==1) return 1;
       StringBuilder sb=new StringBuilder();
       while(i<n && j<n){
        while(j<n && chars[i]==chars[j]){
            j++;
        }
        sb.append(chars[i]);
        if(j-i>1) sb.append(j-i);
        i=j;
       }
        int k=0;
       for(char c:sb.toString().toCharArray()){
        chars[k++]=c;
       }
       return sb.length();
    }
}