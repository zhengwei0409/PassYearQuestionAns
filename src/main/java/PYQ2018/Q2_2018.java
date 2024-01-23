
package PYQ2018;

import java.util.Random;
import java.util.Scanner;

public class Q2_2018 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = 0, AA = 0, AAA = 0; 
        
        System.out.print("Enter N number: ");
        int n = sc.nextInt();
        
        System.out.print("The random numbers are: ");
        
        for(int i = 0; i < n; i++) {
            int num = generateRandom();
            int lastDigit = num % 10;
            
            if(lastDigit >= 0 && lastDigit <= 3) {
                AAA++;
            } 
            else if (lastDigit >= 4 && lastDigit <= 6) {
                AA++;
            } else {
                A++;
            }
            
            System.out.print(num + " ");
        }
        
        System.out.println("\nGroup AAA: " + AAA);
        System.out.println("Group AA: "  + AA);
        System.out.println("Group A: " + A);
        
    }
    
    public static int generateRandom() {
        Random r = new Random();
        return r.nextInt(101) + 50;
    }
}
