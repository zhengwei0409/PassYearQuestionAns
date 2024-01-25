
package PYQ2016;

import java.io.FileInputStream;
import java.util.Scanner;

public class Q4_2016 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2016/Q4.txt"));
            while(sc.hasNextLine()) {
                String pass = sc.nextLine();
                if(pass.length() >= 8 && hasUpper(pass) && hasLower(pass) && hasNumeric(pass) && hasNonAlphanumeric(pass)) {
                    System.out.println("Strong password");
                } else {
                    System.out.println("Not a strong password");
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public static boolean hasUpper(String pass) {
        for(char i: pass.toCharArray()) {
            if(Character.isUpperCase(i)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean hasLower(String pass) {
        for(char i: pass.toCharArray()) {
            if(Character.isLowerCase(i)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean hasNumeric(String pass) {
        for(char i: pass.toCharArray()) {
            if(Character.isDigit(i)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean hasNonAlphanumeric(String pass) {
        for(char i: pass.toCharArray()) {
            if((i >= 33 && i <= 47) || (i >= 58 && i <= 64) || (i >= 91 && i <= 96) || (i >= 123 && i<= 126)) {
                return true;
            }
        }
        return false;
    }
}
