class Solution {
    public boolean lemonadeChange(int[] bills) {
        //20 will require 1 10 and  1 5 or 3 5
        //10m will require 1 5

        int tens=0,fives=0,twenties=0;

       

        for(int a:bills)
        {
            if(a==5) fives++;
            else if(a==10){
                tens++;
                if(fives>0) fives--;
                else return false;
            }
            else{
                twenties++;
                if(tens>0&& fives>0){
                    tens--;
                    fives--;
                }
                else if(fives>2){
                    fives=fives-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}