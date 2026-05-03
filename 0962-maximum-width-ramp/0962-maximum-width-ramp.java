class Solution {
    public int maxWidthRamp(int[] nums) {
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<nums.length;i++){
        if(st.isEmpty()||nums[i]<nums[st.peek()]){
            st.push(i);
        }
     } 
     int maxw=0;

      for (int j = nums.length- 1; j >= 0; j--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[j]) {
                maxw = Math.max(maxw, j - st.peek());
                st.pop();
            }
        }

     return maxw;
    }
}