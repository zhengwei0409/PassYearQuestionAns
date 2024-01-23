
package PYQ2019;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Q4_2019 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2019/myAmbition.txt"));
            
            String text = "";

            System.out.println("The essay is : ");
            while(sc.hasNextLine()) {
                String temp = sc.nextLine();
                text += temp;
                System.out.println(temp);
            }
            
            String[] sentences = text.split("\\."); // dot (.) is a special character
            System.out.println("\nNumber of sentences : " + sentences.length);
            String[] word = text.split(" ");
            System.out.println("Number of sentences : " + word.length);
            
            // count the number of each character
            int[] characters = new int[26];
            for(int i = 0; i < word.length; i++) {
                for(int j = 0; j < word[i].length(); j++) {
                    word[i] = word[i].toUpperCase();
                    int index = word[i].charAt(j) - 'A';
                    if(index >= 26 || index < 0) {
                        continue;
                    } else {
                        characters[index]++;
                    }
                }
            }
            
            for(int i = 0; i < characters.length; i++) {
                System.out.print((char)(i+'A') + " : " + characters[i] + " ");
                if((i+1)%8 == 0) {
                    System.out.println(" ");
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Errororor");
        }
        
    }
}
