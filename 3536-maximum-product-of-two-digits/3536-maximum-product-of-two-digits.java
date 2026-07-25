class Solution {
    public int maxProduct(int n) {
        int num=n;
        int firstmax=0;
        int secondmax=0;
        
        while(num>0){
            int r=num%10;
            if(r>=firstmax){
                secondmax=firstmax;
                firstmax=r;
            }
            if(r>secondmax&&r<firstmax){
                secondmax=r;
            }

            num=num/10;
        }

        return firstmax*secondmax;
        
    }
}