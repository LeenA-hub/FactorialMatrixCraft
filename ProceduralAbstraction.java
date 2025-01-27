/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528lab2;

/**
 *
 * @author ameera
 */
public class ProceduralAbstraction {
    
    //Effect: returns the smallest positive integer n for which n!
    // is greater than or equal to x
    public static int reverseFactorial(int x){        
    int factorial = 1;
    int n = 1;
    
    if (x<=0){
        return 1;
    }
    while(factorial <= x){
        factorial = n * factorial;
        n++;
    }
    return n;
        
    }
    //EFFECT: if the matrix is nice, print the sum and return true. Otherwise, return false.
    public static boolean isMatrixNice(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
       
        if(row != col){
           return false;
        }
        int targetSum = 0;
        for(int j = 0; j< col; j++){
            targetSum += arr[0][j];
        }
        for (int i =1; i <row; i++){
            int rowSum = 0;
            for(int j =0; j<col; j++){
                rowSum += arr[i][j];
            }
            if(rowSum != targetSum){
                return false;
            }
        }
         for (int j = 0; j < col; j++) {
        int colSum = 0;
        for (int i = 0; i < row; i++) {
            colSum += arr[i][j];
        }
        if (colSum != targetSum) {
            return false;
        }
         }
         int PdiagSum = 0;
          for (int i = 0; i < row; i++) {
        PdiagSum += arr[i][i];
    }
    if (PdiagSum != targetSum) {
        return false;
    }
     int SdiagSum = 0;
    for (int i = 0; i < row; i++) {
        SdiagSum += arr[i][row - 1 - i];
    }
    if (SdiagSum != targetSum) {
          return false; 
    }
     System.out.println("The matrix is nice with a sum of: " + targetSum);
    return true;
    }
}
    
    
    
    