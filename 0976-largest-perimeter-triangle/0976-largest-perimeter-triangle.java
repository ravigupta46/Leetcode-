class Solution {
    public boolean checkValidTriangle(int a,int b,int c){
        if(a+b<=c){
            return false;
        }
        if(b+c<=a){
            return false;
        }
        if(a+c<=b){
            return false;
        }
        return true;
    }
    public int largestPerimeter(int[] nums) {
        int maxperi=0;
      
        int n=nums.length;
        // for(int i=0;i<n-2;i++){
        //     int a=nums[i];
        //    for(int j=i+1;j<n-1;j++){
        //     int b=nums[j];
        //     for(int k=j+1;k<n;k++){
        //         int c=nums[k];

        //         if(checkValidTriangle(a,b,c)){
        //             if((a+b+c)>maxperi){
        //                 maxperi=a+b+c;
        //             }
        //         } 
        //     }
        //    }
        // }
        Arrays.sort(nums);
        int s1 = n-1;
        int s2 = n-2;
        int s3 = n-3;
        int maxP = 0;
        while(s1>=0 && s2 >=0 && s3 >= 0){
            if(checkValidTriangle(nums[s1], nums[s2], nums[s3])){
                 maxP = nums[s1] + nums[s2] + nums[s3];
                break;
            }
            s1--;
            s2--;
            s3--;
        }
        return maxP;
    }
}