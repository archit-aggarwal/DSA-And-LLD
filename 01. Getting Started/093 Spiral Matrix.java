//Link : https://leetcode.com/problems/spiral-matrix/
//Time Complexity : O(N*M)
// Extra Space : O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int fr = 0, fc = 0, lr = rows-1, lc = cols -1;
        int count = 0;
        
        List<Integer> list = new ArrayList<>();
        
        while(count != rows * cols) {
            //first row
            for(int j=fc;j<=lc;j++) {
                list.add(matrix[fr][j]);
                count++;
            }
            fr++;
            
            if(count == rows*cols) break;
            
            //last col
            for(int i=fr;i<=lr;i++) {
                list.add(matrix[i][lc]);
                count++;
            }
            lc--;
            
            if(count == rows*cols) break;
            
            //last row
            for(int j=lc;j>=fc;j--) {
                list.add(matrix[lr][j]);
                count++;
            }
            lr--;
            
            if(count == rows*cols) break;
            
            //first col
            for(int i=lr;i>=fr;i--) {
                list.add(matrix[i][fc]);
                count++;
            }
            fc++;
            
            if(count == rows*cols) break;
        }
        
        return list;
    }
}
