class Solution {
    public int minimumDeletions(int[] nums) {

        int ans = 0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int minidx = 0;
        int maxidx = 0;
        int n=nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < mini) {
                minidx = i;
                mini = nums[i];
            }
            if (nums[i] > maxi) {
                maxidx = i;
                maxi = nums[i];
            }
        }

        int i = 0;
        int j = 0;

        while (i <= minidx) {
            i++;
        }
        while (j <= maxidx) {
            j++;
        }
        int op1 = 0;
        if (i < j) {
            op1 = i + (j - i);
        } else {
            op1 = j + (i - j);
        }
        i = nums.length - 1;
        j = i;

        while (i >= minidx) {
            i--;
        }
        while (j >= maxidx) {
            j--;
        }
        j = n - j-1;
        i = n - i-1;
        int op2 = 0;
        if (i <= j) {
            op2 = i + (j - i);
        } else {
            op2 = j + (i - j);
        }

        i = 0;
        j = nums.length - 1;
        while (i <= minidx) {
            i++;
        }
        while (j >= maxidx) {
            j--;
        }
        j=n-j-1;
        
       int op3 = i + j;
        i = nums.length - 1;
        j = 0;
        while (j <= maxidx) {
            j++;
        }
        while (i >= minidx) {
            i--;
        }
        i=n-i-1;
       int op4 = i + j;

        ans = Math.min(Math.min(op1, op2), Math.min(op3, op4));
        return ans;

    }
}