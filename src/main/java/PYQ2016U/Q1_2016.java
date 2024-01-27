
package PYQ2016U;

import java.util.Scanner;

public class Q1_2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in pounds: ");
        double pounds = sc.nextDouble();
        System.out.printf("%.1f pounds is %.3f kilograms",pounds, pounds*0.454);
    }
}
