class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        while(i<j){
            if(colors[i]!=colors[j]){
                return Math.abs(j-i);
            }
            else if(colors[i]==colors[j]){
                int key=colors[i];
                int option1=0;
                int option2=0;
                int k=i;
                int l=j;
                while( i<colors.length&&colors[k]==key){
                    k++;
                }
                option1=j-k;
                while(j>=0 && colors[l]==key){
                    l--;
                }
                option2=l-i;
                return Math.max(option1,option2);
                
            }
            else{
                j--;
            }
        }
        return 0;
    }
}