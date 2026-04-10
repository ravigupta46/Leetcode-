class Solution {
    public int minimumDistance(int[] nums) {
            int n=nums.length;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int a=nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[j]==a && nums[k]!=a){
                    k--;
                }
                else if(nums[j]!=a && nums[k]==a){
                    j++;
                }
                else if(nums[j]==a && nums[k]==a){
                    if(Math.abs(i-j)+Math.abs(i-k)+Math.abs(j-k)<=mini){
                        mini=Math.abs(i-j)+Math.abs(i-k)+Math.abs(j-k);
                    }
                    
                k--;
                }
                else{
                j++;
                k--;
                }
            }
        }
        if(mini==Integer.MAX_VALUE) return -1;
        return mini;
    }
}