
package PYQ2016;

import java.util.Random;
import java.util.Scanner;


public class Q3_2016 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num; i++) {
            int random = r.nextInt(1001);
            array[i] = random;
        }
        System.out.print("The random integer : ");
        display(array);
        System.out.println("\nMaximum number : " + findMax(array));
        System.out.print("The approximation of the integer to the nearest tenth: ");
        round(array);
        System.out.print("\nThe random integer in reverse order: ");
        reverse(array);
    }
    
    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void round(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int lastDigit = num%10;
            num /= 10;
            if(lastDigit >= 5) {
                num = (num+1) * 10;
            } else {
                num = num * 10;
            }
            System.out.print(num + " ");
        }
    }
    
    public static void reverse(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            int reverse = 0;
            int num = arr[i];
            while(num != 0) {
                int lastDigit = num%10;
                reverse = (reverse*10) + lastDigit;
                num /= 10;
            }
            System.out.print(reverse + " ");
        }
    }
}
