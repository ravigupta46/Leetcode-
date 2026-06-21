class Solution {
    public void countsort(int[] nums){
        int maxi=0;
        for(int a:nums){
            maxi=Math.max(maxi,a);
        }
        int [] arr=new int[maxi+1];

        for(int a:nums){
            arr[a]++;
        }
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                while(arr[i]>0){
                    nums[idx++]=i;
                    arr[i]--;
                }
            }
        }
    }
    public int maxIceCream(int[] costs, int coins) {
       countsort(costs);
        int count=0;
        for(int a:costs){
            if(coins>=a){
                coins-=a;
                count++;
            }
            else break;
        }
        return count;
    }
}