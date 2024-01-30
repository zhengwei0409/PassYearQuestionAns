
package PYQ2023;

import java.util.Scanner;

public class Q2_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents;
        
        while(true) {
            System.out.print("Enter the number of student: ");
            numOfStudents = sc.nextInt();
            
            if(numOfStudents >= 0 && numOfStudents <= 10)  break;
            else System.out.print("Error!!! ");

        }
        
        int[][] array = new int[numOfStudents][];
        int numOfSubjects, mark;
        
        for(int i = 0; i < numOfStudents; i++) {
            while(true) {
                System.out.print("Enter the number of subjects for student " + (i+1) + ": ");
                numOfSubjects = sc.nextInt();
                if(numOfSubjects >= 0 && numOfSubjects <= 10) break;
                else System.out.print("Error!!! ");
            }
            
            array[i] = new int[numOfSubjects];
            for(int j = 0; j < numOfSubjects; j++) {
                while(true) {
                    System.out.print("Student (" + (i+1) + ") Enter the mark for Subject " + (j+1) + ": ");
                    mark = sc.nextInt();
                    if(mark >= 0 && mark <= 100) break;
                    else System.out.print("Error!!! ");
                }
                array[i][j] = mark;
            }
        }
        
        display(array);
        
    }
    
    public static void display(int[][] array) {
        
        System.out.println("List of Students (" + array.length + " students)");
        int[] averageMarks = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            int average = 0;
            System.out.println("Student " + (i+1));
            for(int j = 0; j < array[i].length; j++) {
                System.out.println(" Subject " + (j+1) + ":" + array[i][j]);
                average += array[i][j];
            }
            average = average / array[i].length;
            System.out.println("Average Marks: " +  average);
            averageMarks[i] = average;
        }
        
        int highestMarkStudent = 0;
        int highestMark = Integer.MIN_VALUE;
        for(int i = 0; i < averageMarks.length - 1; i++) {
            if(averageMarks[i] > highestMark) {
                highestMark = averageMarks[i];
                highestMarkStudent = i+1;
            }
        }
        
        System.out.println("Student " + highestMarkStudent + " has the highest average, with " + highestMark + " marks");
    }
}
