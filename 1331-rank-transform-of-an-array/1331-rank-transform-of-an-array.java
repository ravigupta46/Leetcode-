class Solution {
    public int[] arrayRankTransform(int[] arr) {
         int n=arr.length;
        int[] dupli=Arrays.copyOfRange(arr,0,n);
        Arrays.sort(dupli);
       int idx=1;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mp.containsKey(dupli[i])){
                mp.put(dupli[i],idx);
                idx++;
            }
        }

        for(int i=0;i<n;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;
        
    }
}