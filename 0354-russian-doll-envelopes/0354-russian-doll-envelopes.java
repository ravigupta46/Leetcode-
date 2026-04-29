class Solution {

    // 🔥 Custom binary search (lower_bound)
    public int binarySearch(int[] lis, int len, int target){
        int low = 0, high = len - 1;
        int ans = len;  // default → insert at end

        while(low <= high){
            int mid = (low + high) / 2;

            if(lis[mid] >= target){
                ans = mid;          // possible answer
                high = mid - 1;     // search left for smaller index
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int maxEnvelopes(int[][] envelopes) {

        // 🔥 Step 1: sort
        Arrays.sort(envelopes, (a, b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return b[1] - a[1];
        });

        int n = envelopes.length;
        int[] lis = new int[n];
        int len = 0;

        // 🔥 Step 2: LIS using custom binary search
        for(int[] env : envelopes){
            int h = env[1];

            int idx = binarySearch(lis, len, h);

            lis[idx] = h;

            if(idx == len){
                len++;   // extend LIS
            }
        }

        return len;
    }
}