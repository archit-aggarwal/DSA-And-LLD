//Link: https://practice.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1
//Time Complexity = O(N * M)
//Extra Space = O(1)

class Solution
{
    public int[] FindExitPoint(int[][] matrix)
    {
        // code here
        int[] res = new int[2];
        int i = 0;
        int j = 0;
        int dir = 0;
        
        while(i >= 0 && i < matrix.length && j >=0 && j < matrix[0].length) {
            if(matrix[i][j] == 1) {
                dir = (dir + 1) % 4;
                matrix[i][j] = 0;
            }
            
            if(dir == 0) {
                j++;
            } else if(dir == 1) {
                i++;
            } else if(dir == 2) {
                j--;
            } else {
                i--;
            }
        }
        
        //you have exited the matrix
        if(dir == 0) {
            j--;
        } else if(dir == 1) {
            i--;
        } else if(dir == 2) {
            j++;
        } else {
            i++;
        }
        
        res[0] = i;
        res[1] = j;
        
        return res;
    }
}
