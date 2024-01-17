
package PYQ2020;

import java.io.FileInputStream;
import java.util.Scanner;

public class Q3_2020 {
    public static void main(String[] args) {
        try{
            System.out.println("Frequency Distribution Table");
            Scanner sc = new Scanner(new FileInputStream("/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2020/raw.txt"));
            int[] num = new int[11];
            int mode = 0;
            
            while(sc.hasNextInt()) {
                num[sc.nextInt()]++;
            }
            
            // find the mode
            for(int i = 2; i < num.length; i++) {
                if(i%2 == 0) {
                    System.out.println(i + " : " + num[i]);
                    if(num[i] > mode) {
                        mode = num[i];
                    } 
                }
            }
            System.out.println("The mode of the dataset is : " + mode);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
