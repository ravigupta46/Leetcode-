class Solution {
    public int brokenCalc(int startValue, int target) {
        int op=0;
        while(target>startValue){
            if((target&1)==0){
                target/=2;
            }
            else{
                target+=1;
            }

            op++;
        }
        return op+(-target+startValue);
        
    }
}