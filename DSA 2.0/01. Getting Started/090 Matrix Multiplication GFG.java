class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
            
            int commonDimension = A[0].length;
            
           //add code here.
            for(int i=0;i<C.length;i++) {
              for(int j=0;j<C[0].length;j++) {
                  for(int k=0;k<commonDimension;k++) {
                      C[i][j] += A[i][k] * B[k][j];
                  }
               }
    }
    
        }
}
