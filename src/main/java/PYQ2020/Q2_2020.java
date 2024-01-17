
package PYQ2020;

import java.util.Scanner;

public class Q2_2020 {
    public static void main(String[] args) {
        System.out.println("Enter Location 1");
        double latitude1 = requestInput();
        double longitude1 = requestInput();
        System.out.println("Enter Location 2");
        double latitude2 = requestInput();
        double longitude2 = requestInput();
        System.out.printf("Location 1 : %.6f Latitude ,  %.6f Longitude\n", latitude1, longitude1);
        System.out.printf("Location 2 : %.6f Latitude ,  %.6f Longitude\n", latitude2, longitude2);
        double distance = calculateDistance(latitude1,longitude1,latitude2,longitude2);
        System.out.printf("Distance : %.2f KM", distance);
    }
    
    public static double requestInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Direction: [N, S, E, W]: ");
        char direction = sc.next().charAt(0); // next() method returns a String, next().charAt(0) to get the first character of the input as a char. 
        System.out.print("Enter Degree, Minute and Second : ");
        return calculateDecimalDegree(direction,sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
    }
    
    public static double calculateDecimalDegree(char direction, double degree, double minute, double second) {
        double decimalDegree = degree + (minute * 60 + second) / 3600;
        if(direction == 'S' || direction == 'W') {
            decimalDegree *= -1;
        }
        return decimalDegree;
    }
    
    public static double calculateDistance(double latitude1, double longitude1, double latitude2, double longitude2) {
        double a = Math.pow(Math.sin(Math.toRadians((latitude1 - latitude2)/2)), 2)
                + Math.cos(Math.toRadians(latitude1)) 
                * Math.cos(Math.toRadians(latitude2))
                * Math.pow(Math.sin(Math.toRadians((longitude1 - longitude2)/2)), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt((1-a)));
        double d = 6371 * c;
        return d;
    }
}
