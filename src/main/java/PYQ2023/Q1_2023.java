
package PYQ2023;

import java.util.Random;

public class Q1_2023 {
    public static void main(String[] args) {
        Random r = new Random();
    
        int randomNumber = r.nextInt(Integer.MAX_VALUE - 1000) + 1000;
        int sumOfDigit = 0, reverseNum = 0;
        
        
        System.out.println("Generate Number : " + randomNumber);
        
        while(randomNumber > 0) {
            int lastDigit = randomNumber % 10;
            sumOfDigit += lastDigit;
            reverseNum = reverseNum * 10 + lastDigit;
            randomNumber /= 10;
        }
        
        System.out.println("Number in reverse order : " + reverseNum);
        System.out.println("The sum of all integers : " + sumOfDigit);
    }
}
