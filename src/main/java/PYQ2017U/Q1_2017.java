
package PYQ2017U;

import java.util.Scanner;

public class Q1_2017 {
    public static void main(String[] args) {
        final int N;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        for(int i = 1; i <= N; i++) 
            System.out.print(getTriangular(i) + " ");
        System.out.println();
    }
    
    public static int getTriangular(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) 
            sum += i;
        return sum;
    }
}
