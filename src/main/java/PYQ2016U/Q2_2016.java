
package PYQ2016U;

import java.util.Scanner;

public class Q2_2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0) {
            sum += num%10;
            num /= 10;
        }
        System.out.println("The sum of the digit is " + sum);
    }
}
