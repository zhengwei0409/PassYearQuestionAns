
package PYQ2017;

import java.util.Scanner;

public class Q2_2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double tuitionFee = sc.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt();
        
        double fee = computeFee(tuitionFee, rate, year);
        System.out.printf("Computed tuition fee for year %d is: %.2f",year,fee);
    }
    
    public static double computeFee(double tuitionFee, double rate, int year) {
        for(int i = 1; i < year; i++) { // tuition fee start increase after year1
            tuitionFee += tuitionFee * (rate/100);
        }
        return tuitionFee;
    }
}
