
package PYQ2019U;

import java.util.Scanner;

public class Q5_2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value for a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Q5_QuadraticEquation e = new Q5_QuadraticEquation(a,b,c);
        
        System.out.printf("The equation is : %dx(^2) + (%d)x + (%d)",a,b,c);
        System.out.printf("\nDiscriminant: %.0f" , e.discriminant());
        if(e.discriminant() < 0) {
            System.out.println("\nThe equation has no root");
        } else {
            System.out.printf("\nThe root: %.0f and %.0f", e.calcRoot1(),e.calcRoot2());
        }
    }
}
