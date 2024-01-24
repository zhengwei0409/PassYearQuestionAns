
package PYQ2017;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Q3_2017 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] arr = new char[6];
        
        
        for(int i = 0; i < arr.length; i++) {
            int num = r.nextInt(58) + 65;
            while(num > 90 && num < 97) { 
                num = r.nextInt(58) + 65;
            }
            arr[i] = (char) num; // convert the number to ASCII character
        }
        
        
        String str = display(arr);
        System.out.println("The string generated is: " + str);
        sort(arr,'>');
        System.out.println("String sorted in ascending order: " + display(arr));
        sort(arr,'<');
        System.out.println("String sorted in descending order: " + display(arr));
        
        try{
            PrintWriter w = new PrintWriter(new FileOutputStream("/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2017/data.txt"));
            w.println(str);
            w.close(); // MUST CLOSE FIRST BEFORE READ
            Scanner sc = new Scanner(new FileInputStream("/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2017/data.txt"));
            str = sc.nextLine();
            
            System.out.println("Original string from the file: " + str);

        } catch(Exception e) {
            System.out.println("Error");
        }
    }
    
    public static void sort(char[] arr, char c) {
        if(c == '>') {
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length - i - 1; j++) {
                    if(arr[j] > arr[j+1]) {
                        char temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } else {
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length - i - 1; j++) {
                    if(arr[j] < arr[j+1]) {
                        char temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    
    public static String display(char[] arr) {
        String str = "";
        for(char i: arr) {
            str += i;
        }
        return str;
    }
}
