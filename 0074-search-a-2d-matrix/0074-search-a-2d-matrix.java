class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
     int n=matrix[0].length;

     int start_row=0;
     int end_col=n-1;

     while(start_row<m && end_col>=0){
        if(matrix[start_row][end_col]==target){
            return true;
        }
        else if(matrix[start_row][end_col]>target){
            end_col--;
        }
        else{
            start_row++;
        }
     }
     return false;
    }
}