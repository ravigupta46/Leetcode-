class Solution {
    public boolean isOverlapping(int[] arr1,int[] arr2){
        if(arr1[0]==arr2[0]||arr1[0]==arr2[1]||arr1[1]==arr2[0]||arr1[1]==arr2[1]){
            return true;
        }
        if(arr2[0]>arr1[0] && arr2[0]<arr1[1]){
            return true;
        }
       if(arr1[0]>arr2[0] && arr1[0]<arr2[1]){
            return true;
        }
        return false;
    }
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length==0||secondList.length==0){
            int[][] newarr=new int[0][0];
            return newarr;
        }


        List<int[]> li=new ArrayList<>();
        for(int i=0;i<secondList.length;i++){
            int[] arr1=secondList[i];
            for(int j=0;j<firstList.length;j++){
                int[] arr2=firstList[j];
                if(isOverlapping(arr1,arr2)){
                    int[] arr=new int[2];
                    int first=Math.max(arr1[0],arr2[0]);
                    int second=Math.min(arr1[1],arr2[1]);
                    arr[0]=first;
                    arr[1]=second;
                    li.add(arr);
                }
            }
        }

        int[][] ans=new int[li.size()][2];
        for(int i=0;i<li.size();i++){
            ans[i]=li.get(i);
        }
    return ans;
    }
}