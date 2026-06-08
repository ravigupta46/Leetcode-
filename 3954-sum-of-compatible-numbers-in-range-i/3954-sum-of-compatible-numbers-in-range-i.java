class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int count=0;
        for(int x=1;x<=200;x++){
            if(Math.abs(n-x)<=k){
               if((n&x)==0){
                count=count+x;
                }
            }
        }
        return count;
    }
}