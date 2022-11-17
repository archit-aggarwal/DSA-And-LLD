// https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1

// Time = O(N) : Stepcase Search, Space = O(1)

class GfG {
    int countZeros(int mat[][], int N) {
        int row = 0, col = N - 1, zeros = 0;

        while (row < N && col >= 0) {
            if (mat[row][col] == 0) {
                zeros = zeros + (col + 1); // all zeros in current row
                row++; // no more zeros: discard row
            } else {
                col--; // no zero in current column: discard column
            }
        }

        return zeros;
    }
}
