class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        int[] C=new int[n];
        for(int i=0;i<n;i++){
            a.add(A[i]);
            b.add(B[i]);

            if(a.contains(B[i]) && b.contains(A[i])){
                if(B[i]!=A[i]){
                    C[i]=C[i-1]+2;
                }
                else{
                    if(i>0) C[i]=C[i-1]+1;
                    else C[i]=1;
                }

            }
            else if(a.contains(B[i])||b.contains(A[i])){
                C[i]=C[i-1]+1;
            }
            else{
                if(i==0) C[i]=0;
                else C[i]=C[i-1];
            }
        }
        return C;
    }
}