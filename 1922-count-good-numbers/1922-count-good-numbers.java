class Solution {
    final static int MOD=1000000007;
    public long power(long a,long b){
        if(b==0) return 1;
        
        long half=power(a,b/2);
        long ans=(half*half)%MOD;
        if((b&1)==1){
            ans=(ans*a)%MOD;
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
       long no_of_odd=(n)/2;
       long no_of_even=(n+1)/2;

       return (int)(power(5,no_of_even)*power(4,no_of_odd)%MOD);

    }
}