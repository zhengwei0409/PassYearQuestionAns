
package PYQ2018U;
/*
TEST : 1 2 1 3 4 3
*/
import java.util.Scanner;

public class Q4_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for a, b, c, d, e and f : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        Q4_LinearEquation l = new Q4_LinearEquation(a,b,c,d,e,f);
        
        System.out.println("The equation: ");
        System.out.println(l);
        System.out.println();
        System.out.println("x = " + l.computeX() + " ; " + "y = " + l.computeY());
    }
}
