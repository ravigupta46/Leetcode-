class Solution {

    public boolean isdivisible(int n,int t){
        int flag=1;
        while(n>0){
            int rem=n%10;
            flag*=rem;
            n=n/10;
        }
        return ((flag%t)==0);
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<1000;i++){
            if(isdivisible(i,t)){
                return i;
            }
        }
        return 0;
    }
}