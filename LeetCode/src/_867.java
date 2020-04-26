class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int [][] B = new int [col][row];
        
       
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                B[i][j] = A[j][i];
            }
            
        }
        return B;
    }
}