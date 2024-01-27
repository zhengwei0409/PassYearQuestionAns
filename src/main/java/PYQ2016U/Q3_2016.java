
package PYQ2016U;

import java.util.Scanner;

public class Q3_2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n-1; j++) { // print the leading space
                System.out.print(" ");
            }
            int num = i;
            for(int k = 1; k <= i; k++) { // print the descending number
                System.out.print(num);
                num--;
            }
            for(int s = 2; s <= i; s++) { // print the increasing number
                System.out.print(s);
            }
            System.out.println(); // next line
        }
    }
}
