
package PYQ2018;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4_2018 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new FileInputStream("/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2018/Q4.txt"));
            double maxScore=Integer.MIN_VALUE;
            int indexMaxScore=0,index = 0;
            while(sc.hasNextLine()) {
                String[] arr;
                double score=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
                arr = sc.nextLine().split(",");
                
                String name = arr[0];
                double degreeDifficulty = Double.parseDouble(arr[6]);
                
                for(int i = 1; i < arr.length-1;i++) {
                    double num = Double.parseDouble(arr[i]);
                    if(num > max) {
                        max = num;
                    }
                    if(num < min) {
                        min = num;
                    }
                    score += num;
                }
                
                score = (score - min - max) * degreeDifficulty;
                
                if(score > maxScore) {
                    maxScore = score;
                    indexMaxScore = index;
                }
                
                System.out.println(name + " score " + score);
                nameList.add(name);
                index++;
            }
            
            System.out.println(nameList.get(indexMaxScore) + " is the winner");
            
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
