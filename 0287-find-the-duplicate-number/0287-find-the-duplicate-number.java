class Solution {
    public int findDuplicate(int[] nums) {
    int dup=0;
    for(int bit=1;bit<=32;bit++){
        int mask=1<<bit;

        int countinnums=0;

        for(int num:nums){
            if((num&mask)!=0) countinnums++;

        }
        int countog=0;
        for(int i=1;i<=nums.length-1;i++){
            if((i&mask)!=0) countog++;
        }

        if(countinnums>countog){
            dup=dup|mask;
        }
       
      }
       return dup;
    }
     
}