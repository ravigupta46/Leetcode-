class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=0;
        right[n-1]=0;
        int leftsum=0,rightsum=0;
        for(int i=1;i<n;i++){
            leftsum+=nums[i-1];
            left[i]=leftsum;
        }
        for(int i=n-2;i>=0;i--){
            rightsum+=nums[i+1];
            right[i]=rightsum;
        }
        for(int i=0;i<n;i++){
            answer[i]=Math.abs(left[i]-right[i]);
        }
        return answer;
    }
}