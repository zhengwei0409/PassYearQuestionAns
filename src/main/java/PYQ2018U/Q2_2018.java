
package PYQ2018U;

import java.util.Scanner;

public class Q2_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int numberOfBag = sc.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        double unitWeight = sc.nextDouble();
        
        double totalPrice = unitWeight * numberOfBag * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("Price per kilogram : $5.99");
        System.out.println("Sales tax :         7.25%");
        System.out.printf("Total price :    $ %.2f\n" , totalPriceWithTax);
    }
}
