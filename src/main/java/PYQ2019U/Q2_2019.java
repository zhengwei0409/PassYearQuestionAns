
package PYQ2019U;

import java.util.Scanner;


public class Q2_2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int bagsold = sc.nextInt();
        System.out.print("Enter the weight per kilogram : ");
        int weight = sc.nextInt();
        
        double totalPrice = weight * bagsold * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("Price per kilogram: $5.99");
        System.out.println("Sales Tax: 7.25%");
        System.out.printf("Total Price: $ %.2f", totalPriceWithTax);
    }
}
