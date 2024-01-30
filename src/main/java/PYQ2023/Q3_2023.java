
package PYQ2023;

import java.io.FileInputStream;
import java.util.Scanner;

public class Q3_2023 {
    public static void main(String[] args) {
        String inputFile = "/Users/zhengwei/NetBeansProjects/PassYearQuestion/PastYearQuestion/src/main/java/PYQ2023/ocean_data.csv";
        Q3_DataBuoy[] data = new Q3_DataBuoy[25];
        float avg_water_temp;
        
        loadData(inputFile, data);
        showData(data);
        
        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is " + avg_water_temp);
        
        printMap(data, avg_water_temp);
    }
    
    public static void loadData(String file, Q3_DataBuoy[] a) {
        try{
            Scanner sc = new Scanner(new FileInputStream(file));
            sc.nextLine(); // skip the first line
            for(int i = 0; i < a.length; i++) {
                String[] temp = sc.nextLine().split(",");
                a[i] = new Q3_DataBuoy(temp[0],temp[1],temp[2],temp[3],temp[4]);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void showData(Q3_DataBuoy[] a) {
        System.out.println("Data read from buoy: ");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s","buoy_id","lat","long","air_t","water_t");
        for(int i = 0; i < a.length; i++) {
            System.out.printf("\n%-15s %-10d %-10d %-10.2f %-10.2f",a[i].getBuoyID(), a[i].getLatitude(), a[i].getLongitude(),a[i].getAirT(),a[i].getWaterT());
        }
    }
    
    public static float calculateAvgWaterTemp(Q3_DataBuoy[] a) {
        double total = 0;
        for(int i = 0; i < a.length; i++) {
            total += a[i].getWaterT();
        }
        return (float) total / a.length;
    }
    
    public static void printMap(Q3_DataBuoy[] a, float averageWaterTemp) {
        for(int i = 10; i >= -10; i--) {
            for(int j = -10; j <= 10; j++) {
                boolean gotBuoy = false;
                if(i == 0 && j == 0) {
                    System.out.print("N");
                    continue;
                }
                
                for(int z = 0; z < a.length; z++) {
                    if(i == a[z].getLatitude() && j == a[z].getLongitude()) {
                        if(a[z].getWaterT() > averageWaterTemp) {
                            System.out.print("H");
                            gotBuoy = true;
                            break;
                        } else if(a[z].getWaterT() < averageWaterTemp) {
                            System.out.print("C");
                            gotBuoy = true;
                            break;
                        } else {
                            System.out.print("A");
                            gotBuoy = true;
                            break;
                        }
                    }
                }
                
                if(!gotBuoy) {
                    System.out.print("~");
                }
                
            }
            System.out.println();
        }
    }
}
