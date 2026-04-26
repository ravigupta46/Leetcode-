// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//        int n=nums.length;
//        int[] dp=new int[n];
//        Arrays.fill(dp,1);

//        for(int i=0;i<n;i++){
//         for(int j=0;j<i;j++){
//             if(nums[j]<nums[i]){
//                 dp[i]=Math.max(dp[i],dp[j]+1);
//             }
//         }
//        }
//        for(int i=0;i<n;i++){
//         if(dp[i]>=3){
//             return true;
//         }
//        }
//        return false;
//     }
// }

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  // smallest so far
            } else if (num <= second) {
                second = num; // second smallest
            } else {
                return true;  // found third > first & second
            }
        }

        return false;
    }
}