class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
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