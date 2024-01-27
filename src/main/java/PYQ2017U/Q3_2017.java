
package PYQ2017U;

import java.util.Random;
import java.util.Scanner;

public class Q3_2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of random integer: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = r.nextInt(10001);
        }
        System.out.print("The random number : ");
        display(array);
        
        System.out.println("\nMinimum number : " + findMin(array));
        
        System.out.print("The approximation of the integer to the nearest hundred : ");
        for(int i = 0; i < n; i++) {
            System.out.print(round(array[i]) + " ");
        }
        
        System.out.print("\nThe random integer in reverse order: ");
        for(int i = 0; i < n; i++) {
            System.out.print(reverse(array[i]) + " ");
        }
        
    }
    
    public static void display(int[] a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
    }
    
    public static int findMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for(int i : a) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }
    
    public static int round(int num) {
        int temp = num /100;
        int lastDigit = temp %10;
        if(lastDigit >= 5) {
            return (temp + 1) * 100;
        } else {
            return temp * 100;
        }
    }
    
    public static int reverse(int num) {
        int result = 0;
        while(num > 0) {
            int lastDigit = num%10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }
}
