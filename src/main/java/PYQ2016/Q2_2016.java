
package PYQ2016;

import java.util.Random;
import java.util.Scanner;

public class Q2_2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int playerScore = 0,computerScore = 0;
        while(true) {
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock : ");
            int playerMove = sc.nextInt();
            int computerMove = rand.nextInt(3)+1;
            System.out.println("Player : " +  playerMoveStr(playerMove) + " ----- Computer : " +  playerMoveStr(computerMove));
            if(playerMove == 1 && computerMove == 2) {
                computerScore++;
                System.out.println("Computer win " + computerScore + " time(s)");
            } else if (playerMove == 2 && computerMove == 1) {
                playerScore++;
                System.out.println("PLayer win " + playerScore + " time(s)");
            } else if (playerMove == 1 && computerMove == 3) {
                playerScore++;
                System.out.println("PLayer win " + playerScore + " time(s)");
            } else if (playerMove == 3 && computerMove == 1) {
                computerScore++;
                System.out.println("Computer win " + computerScore + " time(s)");
            } else if (playerMove == 2 && computerMove == 3) {
                computerScore++;
                System.out.println("Computer win " + computerScore + " time(s)");
            } else if (playerMove == 3 && computerMove == 2) {
                playerScore++;
                System.out.println("PLayer win " + playerScore + " time(s)");
            }
            
            if(playerScore == 3) {
                System.out.println("Player wins the game.");
                break;
            } else if(computerScore == 3) {
                System.out.println("Computer wins the game");
                break;
            }
        }
    }
    
    public static String playerMoveStr(int num) {
        if(num == 1) {
            return "Paper";
        } else if (num == 2) {
            return "Scissor";
        } else {
            return "Rock";
        }
    }
}
