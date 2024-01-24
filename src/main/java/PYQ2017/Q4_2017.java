
package PYQ2017;

import java.util.Scanner;

public class Q4_2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First complex numeber. Enter a number for the real part: ");
        int a = sc.nextInt();
        System.out.print("First complex numeber. Enter a number for the imaginary part: ");
        int b = sc.nextInt();
        System.out.print("Second complex numeber. Enter a number for the real part: ");
        int c = sc.nextInt();
        System.out.print("Second complex numeber. Enter a number for the imaginary part: ");
        int d = sc.nextInt();
        Q4_Complex c1 = new Q4_Complex(a,b);
        Q4_Complex c2 = new Q4_Complex(c,d);
        System.out.println("\nFirst complex number: " + c1.toString());
        System.out.println("Second complex number: " + c2.toString());
        Q4_Complex c3 = c1.addComplexNum(c2);
        Q4_Complex c4 = c1.subtractComplexNum(c2);
        System.out.println("Addition of the two complex number: " + c3.toString());
        System.out.println("Subtraction of the two complex number: " + c4.toString());
    }
}
