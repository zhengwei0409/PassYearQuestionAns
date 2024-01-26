
package PYQ2019U;

import java.util.Random;
import java.util.Scanner;

public class Q3_2019 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int r1 = r.nextInt(10);
            int r2 = r.nextInt(10);
            System.out.print("\nWhat is " + r1 + " + " + r2 + " ? ");
            int ans = sc.nextInt();
            if(ans == r1+r2) {
                System.out.println(r1 + " + " + r2 + " = " + ans + " is true");
            } else {
                System.out.println(r1 + " + " + r2 + " = " + ans + " is false");
            }
            System.out.print("Do you want to try another question (y/n)? : ");
            char result = sc.next().charAt(0);
            if(result == 'n') {
                System.out.println("Program ends");
                break;
            }
        }
    }
}
