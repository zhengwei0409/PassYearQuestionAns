
package PYQ2021;

import java.util.Scanner;

public class Q5_2021 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 3 numbers [1-9] : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        char[] operator = {'+','-','*','/'};
        boolean hasSolution = false;
        for(int i = 0; i < operator.length; i++) {
            for(int j = 0; j < operator.length; j++) {
                if(test(operator[i],test(operator[j],a,b),c) == 18 ) {
                    hasSolution = true;
                    if((operator[j] == '+' || operator[j] == '-') && (operator[i] == '*' || operator[i] == '/')) {
                        System.out.printf("(%d %c %d) %c %d = 18\n", a,operator[j],b,operator[i],c);
                    } else {
                        System.out.printf("%d %c %d %c %d = 18\n", a,operator[j],b,operator[i],c);
                    }
                } 
                
                if(test(operator[i],a,test(operator[j],b,c)) == 18 ) {
                    hasSolution = true;
                    if((operator[j] == '+' || operator[j] == '-') && (operator[i] == '+' || operator[i] == '-')) {
                        System.out.printf("%d %c %d %c %d = 18\n", a,operator[i],b,operator[j],c);
                    } else {
                        System.out.printf("%d %c (%d %c %d) = 18\n", a,operator[i],b,operator[j],c);
                    }
                } 
            }
        }
        
        if(!hasSolution) {
            System.out.println("No solution");
        }
    }
    
    public static double test(char operator, double a, double b) {
        switch(operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
}
