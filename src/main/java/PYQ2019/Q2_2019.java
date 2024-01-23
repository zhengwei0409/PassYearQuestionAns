
package PYQ2019;

import java.util.Random;
import java.util.Scanner;

public class Q2_2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        
        int[][] matrix1 = generateMatrix(N);
        int[][] matrix2 = generateMatrix(N);
        
        System.out.println("Matrix A");
        displayMatrix(matrix1);
        System.out.println("Matrix B");
        displayMatrix(matrix2);
        System.out.println("Matrix A + B");
        int[][] result = addMatrix(matrix1,matrix2);
        displayMatrix(result);
        System.out.println("Matrix A X B");
        result = multiplyMatrix(matrix1,matrix2);
        displayMatrix(result);
    }
    
    public static int[][] generateMatrix(int N) {
        int[][] matrix = new int[N][N];
        
        Random r = new Random();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for(int i[] : matrix) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result.length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result.length; j++) {
                for(int z = 0; z < result.length; z++)
                result[i][j] += matrix1[i][z] * matrix2[z][j];
            }
        }
        return result;
    }
}