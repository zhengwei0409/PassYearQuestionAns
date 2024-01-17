

package PYQ2020;

import java.util.Scanner;

public class Q1_2020 {

    public static void main(String[] args) {
        
        System.out.println("This program change all the odd numbers in the array to even numbers.");
        
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] num = new int[size];
        
        System.out.print("Enter five integer numbers : ");
        for(int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        
        convert(num);
        
        System.out.print("The numbers are : ");
        for(int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        
    }
    
    public static void convert(int[] a) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0) {
                a[i]++;
            }
        }
    }
}
