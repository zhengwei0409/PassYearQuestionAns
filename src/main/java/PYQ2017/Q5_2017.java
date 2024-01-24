
package PYQ2017;

import java.util.Scanner;

public class Q5_2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = sc.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = sc.nextInt();
        
        System.out.println("\nEssay score: ");
        Q5_Essay e = new Q5_Essay(grammar, spelling, length, content);
        System.out.println(e.toString());
        
        int score = grammar + spelling + length + content;
        Q5_GradedActivity g = new Q5_GradedActivity();
        g.setScore(score);
        System.out.println(g.toString());
    }
}
