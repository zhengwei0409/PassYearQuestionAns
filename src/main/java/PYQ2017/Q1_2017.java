
package PYQ2017;

import java.util.Scanner;
/*
this program print a horizontal graph based on the input of the user
eg. number1 = 3
    number2 = 5
    number3 = 1

    output:
    ***
    *****
    *
*/
public class Q1_2017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
        int inputNumber;
        int value = 0;
        int counter = 1; // e1
        while(counter <= 5) { // e2
            System.out.print("Enter number: ");
            inputNumber = input.nextInt();
            
            if(inputNumber >= 1 && inputNumber <= 30) {
                switch (counter) { // e3
                    case 1: number1 = inputNumber; break;
                    case 2: number2 = inputNumber; break;
                    case 3: number3 = inputNumber; break;
                    case 4: number4 = inputNumber; break;
                    case 5: number5 = inputNumber; break;
                } // e4
                counter++;
            } else {
                System.out.println( "Invalid Input\nNumber should be between 1 and 30" );
            }
        }
        // print histograms
        for(counter = 1; counter <= 5; counter++) { //e5 //e6
            switch(counter) { //e8
                case 1: value = number1; break;
                case 2: value = number2; break;
                case 3: value = number3; break;
                case 4: value = number4; break;
                case 5: value = number5; break;
            }
            for(int j = 1; j <= value; j++) // e9,e10
                System.out.print("*");
            System.out.println();
        }
    }
}
