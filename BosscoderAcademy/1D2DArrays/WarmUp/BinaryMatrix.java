package BosscoderAcademy.1D2DArrays.WarmUp;

/*
 * Given an m x n binary matrix mat, return the number of special positions in mat.

A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column 
j are 0 (rows and columns are 0-indexed).
 */

public class BinaryMatrix {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i=0; i<mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1 && isSpecialRow(i, mat) && isSpecialColumn(j, mat)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isSpecialRow(int row, int [][] mat){
        int sum = 0;
        for(int i=0; i<mat[row].length; i++){
            sum += mat[row][i];
            if(sum > 1){
                return false;
            }            
        }
        return (sum <= 1);
    }

    public boolean isSpecialColumn(int col, int [][] mat){
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            sum += mat[i][col];
            if(sum > 1){
                return false;
            }            
        }
        return (sum <= 1);
    }
}
