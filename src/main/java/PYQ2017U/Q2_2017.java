
package PYQ2017U;

import java.util.Scanner;
/*
Enter the number of teams: 5
Enter team 1 name: Norwich City
Enter team 1 score: 24
Enter team 2 name: Newcastle United
Enter team 2 score: 42
Enter team 3 name: Blackburn Rovers
Enter team 3 score: 12
Enter team 4 name: Queens Park Rangers
Enter team 4 score: 20
Enter team 5 name: Birmingham City
Enter team 5 score: 22
*/
public class Q2_2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];
        for(int i = 0; i < n; i++) {
            sc.nextLine(); // comsume <enter> buffer
            System.out.print("Enter team " + (i+1) + " name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter team " + (i+1) + " score: ");
            score[i] = sc.nextInt();
        }
        
        // bubble sort
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(score[j+1] > score[j]) {
                    int temp = score[j];
                    String tempN = name[j];
                    score[j] = score[j+1];
                    name[j] = name[j+1];
                    score[j+1] = temp;
                    name[j+1] = tempN;
                }
            }
        }
        
        System.out.println("List of team with the highest team score first");
        for(int i = 0; i < n; i++) {
            System.out.print(name[i] + "(" + score[i] + ")" + " | ");
        }
    }
}
