
package PYQ2022;

import java.util.Random;

public class Q1_2022 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.print("3 random price value : ");
        
        for(int i = 0; i < 3; i++) {
            System.out.printf("%.2f ",r.nextDouble(201)+100);
        }
        
        System.out.print("\n5 random even-numbered years : ");
        int cnt = 0;
        while(cnt < 5) {
            int year = r.nextInt(34)+1990;
            if(year % 2 == 0) {
                System.out.print(year + " ");
                cnt++;
            }
        }
        
        System.out.print("\nCar Plate Number : ");
        System.out.print(r.nextInt(90000)+10000);
        for(int i = 0; i < 2; i++) {
            char plateChar = (char) ('Z' - r.nextInt(26));
            System.out.print(plateChar);
        }
        
        System.out.print("\nRandom Word : ");
        int wordLength = r.nextInt(8) + 1;
        for(int i = 0; i < wordLength; i++) {
            int num = r.nextInt(26);
            int upperOrLower = r.nextInt(2);
            if(upperOrLower == 0) {
                System.out.print((char) ('Z' - num));
            } else {
                System.out.print((char) ('z' - num));
            }
        }
    }
}
