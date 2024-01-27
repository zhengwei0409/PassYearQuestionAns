
package PYQ2016U;

import java.util.Random;

public class Q5_2016 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[3][3];
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(2);
            }
        }
        
        for(int i[] : arr) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < arr.length; i++) { // check for row
            if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                System.out.println("All " + arr[i][0] + "s on row " + i);
            }
        }
        
        for(int i = 0; i < arr.length; i++) { // check for column
            if(arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
                System.out.println("All " + arr[0][i] + "s on column " + i);
            }
        }
        
        // check for diagonal
        if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] || arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
            System.out.println("All " + arr[1][1] + "s on diagonal");
        } 
    }
}
