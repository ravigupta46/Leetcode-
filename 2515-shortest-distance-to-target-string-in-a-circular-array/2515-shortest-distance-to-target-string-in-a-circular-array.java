class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int idx=-1;
        int gap=Integer.MAX_VALUE;
        int n=words.length;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int diff=Math.abs(i-startIndex); //forward se

                int dist=Math.min(diff,n-diff); //backward
                if(gap>dist){
                    gap=dist;
                    idx=i;
                }
            }
        }

        if(idx==-1) return -1;

        return gap;


    }
}