/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
public class MatrixSetRowAndColumnZero {
    
    public static void main(String[] args){
        int[][] matrix = {{1,1,1,0},{1,1,1,1},{0,1,1,0}};
        
        matrixZero(matrix);
    }

    
    public static void matrixZero(int[][] matrix){
        boolean[] rows = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        
        
        // set row and column when an element is 0.
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows[i] = true;
                    column[j]= true;
                }
               
            }
        }
        
        // set elements to Zero when any of row or column is 0
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(rows[i]||column[j]){
                    matrix[i][j] =0;
                }
               
            }
        }
        
        //just to display.
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(" "+matrix[i][j]);              
            }
            System.out.println("");
            
        }
    }
}
