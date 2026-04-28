class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int k=0;
        int[] flatten=new int[m*n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flatten[k++]=grid[i][j];
            }
        }

        int rem=flatten[0]%x;
        for(int a:flatten){
            if(a%x!=rem){
                return -1;
            }
        }
        if(flatten.length==1) return 0;
        boolean flag=true;
        for(int i=1;i<flatten.length;i++){
            if(flatten[i-1]!=flatten[i]) flag=false;
        }
        if(flag==true) return 0;
        Arrays.sort(flatten);
        
        int mingap=Integer.MAX_VALUE;
     
        int ele = flatten[flatten.length / 2];

       
       
        int ans=0;

        for(int a:flatten){
            ans+=Math.abs(ele-a)/x;
        }
        return ans;
        
    }
}