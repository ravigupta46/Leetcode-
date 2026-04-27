class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0||i==nums.length-1){
                li.add(nums[i]);

            }
            else{
                int j=i-1;
                int k=i+1;
                while(j>=0 && nums[j]<nums[i]){
                    j--;
                }
                while(k<nums.length && nums[k]<nums[i]){
                    k++;
                }
                if(j==-1||k==nums.length){
                    li.add(nums[i]);
                }
            }
        }
        return li;
    }
}