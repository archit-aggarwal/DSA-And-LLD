class Solution {
    
    public void transpose(int[][] mat) {
        //traverse only in upper triangle
        for(int i=0;i<mat.length;i++) {
            for(int j=i;j<mat[0].length;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    
    
    public void reverseRow(int[][] matrix,int i) {
        int lo = 0;
        int hi = matrix[0].length -1;
        
        while(lo < hi) {
            int temp = matrix[i][lo];
            matrix[i][lo] = matrix[i][hi];
            matrix[i][hi] = temp;
            lo++;
            hi--;
        }
    }
    
    public void rotate(int[][] matrix) {
        transpose(matrix);
        
        for(int i=0;i<matrix.length;i++) {
            reverseRow(matrix,i);
        }
    }
}
