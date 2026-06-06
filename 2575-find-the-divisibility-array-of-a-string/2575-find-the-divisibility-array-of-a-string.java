class Solution {
    public int[] divisibilityArray(String word, int m) {
        
        int n=word.length();
        int[] ans=new int[n];
        Arrays.fill(ans,0);
       long num=0;
        for(int i=0;i<n;i++){
            char c=word.charAt(i);
            int a=c-'0';
            num=(num*10+a)%m;
           
            if(num==0){
                ans[i]=1;
                
            }
        }
        return ans;
    }
}