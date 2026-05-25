class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        HashSet<Integer> st=new HashSet<>();
        int i=0;
        while(i<n){
            int a=nums[i];
            if(!st.contains(a)){
                int c=0;
                while(i<n&& c<k &&nums[i]==a){
                    li.add(a);
                    c++;
                    i++;
                }
                st.add(a);
            }
            else{
                i++;
            }
            
        }
        int[] ans=new int[li.size()];
        int z=0;
        for(int a:li){
            ans[z++]=a;
        }
return ans;
    }
}