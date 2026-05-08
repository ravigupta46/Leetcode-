class Solution {
public:
    int kthSmallest(vector<vector<int>>& matrix, int k) {
        priority_queue<int,vector<int>,greater<int>> minheap;
        int n=matrix.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                minheap.push(matrix[i][j]);
            }
        }
        int m=0;
        int fr=0;
        while(m<k){
         fr= minheap.top();
           minheap.pop();
           m++;
        }
        return fr;
    }
};