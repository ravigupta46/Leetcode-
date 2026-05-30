class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_cost=0;
        int total_gas=0;
        for(int g:gas){
            total_gas+=g;
        }

        for(int c:cost){
            total_cost+=c;
        }
        if(total_gas<total_cost) return -1;
        int curr_gas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            curr_gas=curr_gas+gas[i]-cost[i];
            if(curr_gas<0){
                start=i+1;
                curr_gas=0;
            }
        }
        return start;
    }
}