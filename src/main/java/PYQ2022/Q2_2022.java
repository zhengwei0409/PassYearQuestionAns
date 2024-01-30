
package PYQ2022;

import java.io.FileInputStream;
import java.util.Scanner;

public class Q2_2022 {
    public static void main(String[] args) {
        String file = "/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2022/Diving.txt";
        int totalParticipants = 0;
        

        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            
            while(sc.hasNextLine()) {
                for(int i = 0; i < 5; i++) {
                    sc.nextLine();
                }
                totalParticipants++;
            }
            
            Q2_Diving[] array = new Q2_Diving[totalParticipants];
            
            sc = new Scanner(new FileInputStream(file));
            
            int participantsCnt = 0;
            
            while(sc.hasNextLine()) {
                double[][] judgesScore = new double[3][7];
                double[] difficultyRating = new double[3];
                
                String[] temp;
                String name = sc.nextLine();
                String country = sc.nextLine();
                
                for(int j = 0; j < 3; j++) {
                    temp = sc.nextLine().split(" ");
                    for(int i = 0; i < temp.length - 1; i++) {
                        judgesScore[j][i] = Double.parseDouble(temp[i]);
                    }
                    difficultyRating[j] = Double.parseDouble(temp[7]);
                }
                
                array[participantsCnt] = new Q2_Diving(name,country,judgesScore,difficultyRating);
                
                participantsCnt++;
                
            }
            
            for(int i = 0; i < array.length; i++) {
                System.out.println(array[i].toString());
            }
            
            displayWinner(array);
            
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void displayWinner(Q2_Diving[] a) {
        String[] name = new String[a.length], country = new String[a.length];
        double[] totalScore = new double[a.length];
        
        for(int i = 0; i < a.length; i++) {
            name[i] = a[i].getName();
            country[i] = a[i].getCountry();
            totalScore[i] = a[i].computeScore();
        }
        
        // bubble sort
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - i - 1; j++) {
                if(totalScore[j] < totalScore[j+1]) {
                    // sort the score
                    double temp = totalScore[j];
                    totalScore[j] = totalScore[j+1];
                    totalScore[j+1] = temp;
                    
                    // name as well
                    String tempStr = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tempStr;
                    
                    // country as well
                    tempStr = country[j];
                    country[j] = country[j+1];
                    country[j+1] = tempStr;
                }
            }
        }
        
        System.out.println("Gold : " + name[0] + " (" + country[0] + ") ");
        System.out.println("Silver : " + name[1] + " (" + country[1] + ") ");
        System.out.println("Bronze : " + name[2] + " (" + country[2] + ") ");
        
    }
}
