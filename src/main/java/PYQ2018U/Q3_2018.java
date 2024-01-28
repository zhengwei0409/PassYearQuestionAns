
package PYQ2018U;

import java.io.FileInputStream;
import java.util.Scanner;

public class Q3_2018 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2018U/student.txt"));
            String[] name = new String[10];
            int[] marks = new int[10];
            int cntIndex = 0;
            while(sc.hasNextLine()) {
                String[] temp = sc.nextLine().split(",");
                name[cntIndex] = temp[0];
                marks[cntIndex] = Integer.parseInt(temp[1]);
                cntIndex++;
            }
            
            
            int max = Integer.MIN_VALUE;
            String highestMarkName = "";
            for(int i = 0; i < name.length; i++) {
                if(marks[i] > max) {
                    max = marks[i];
                    highestMarkName = name[i];
                }
            }
            
            int min = Integer.MAX_VALUE;
            String lowestMarkName = "";
            for(int i = 0; i < name.length; i++) {
                if(marks[i] > 0) {
                    if(marks[i] < min) {
                        min = marks[i];
                        lowestMarkName = name[i];
                    }
                }
            }
            
            int studentAbsent = 0;
            for(int i = 0; i < marks.length; i++) {
                if(marks[i] == -1) {
                    studentAbsent++;
                }
            }
            
            System.out.println("The student with the highest mark: " + highestMarkName + " " + max);
            System.out.println("The student with the lowest mark: " + lowestMarkName + " " + min);
            System.out.println("The number of student who were absent from the exam : " + studentAbsent);
            
            sc.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
