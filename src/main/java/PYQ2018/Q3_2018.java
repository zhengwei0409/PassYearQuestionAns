
package PYQ2018;

import java.util.Scanner;

/*
try to draw the pattern on a paper & find the pattern (need to print how many character in one line etc.)
of course there r many other ways to solve this question ><
*/

public class Q3_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter font size: ");
        int size = sc.nextInt();
        System.out.print("Enter font type: ");
        String type = sc.next();
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = sc.nextInt();
        
        display(size,type,format);

    }
    
    public static void display(int size, String type, int format) {
        
        if(format == 1) {
            displayHorizontalLineV(size,type);
            displayBetweenV(size,type);
            System.out.println(); // next line
            displayHorizontalLineV(size,type);
            displayBetweenV(size,type);
            System.out.println(); // next line
            displayHorizontalLineV(size,type);
        } else {
            displayHorizontalLineH(size,type);
            displayBetweenH(size,type);
            System.out.println(); // next line
            displayHorizontalLineH(size,type);
        }
    }
    
    /* 
    method for displaying the horizontal line for the vertical format
    eg. size 3
        *****
    */
    public static void displayHorizontalLineV(int size, String type) {
        for(int i=0; i < size + 2; i++) {
            System.out.print(type);
        }
    }
    
    /* 
    method for displaying the line between for the vertical format
    eg. size 3
        *   *
        *   *
        *   *
    */
    public static void displayBetweenV(int size,String type) {
        for(int j=0; j < size; j++) {
            System.out.print("\n" + type);
            for(int i=0; i < size; i++) {
                System.out.print(" ");
            }
            System.out.print(type);
        }
    }
    
    /* 
    method for displaying the horizontal line for the horizontal format
    eg. size 3
        *********
    */
    public static void displayHorizontalLineH(int size, String type) {
        for(int i=0; i < 3 + (size*2); i++) {
            System.out.print(type);
        }
    }
    
    /* 
    method for displaying the line between for the horizontal format
    eg. size 3
        *   *   *
        *   *   *
        *   *   *
    */
    public static void displayBetweenH(int size,String type) {
        for(int j=0; j < size; j++) {
            System.out.print("\n" + type);
            for(int i=0; i < size; i++) {
                System.out.print(" ");
            }
            System.out.print(type);
            for(int i=0; i < size; i++) {
                System.out.print(" ");
            }
            System.out.print(type);
        }
    }
}
