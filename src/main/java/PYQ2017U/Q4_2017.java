
package PYQ2017U;

import java.io.*;
/*
NOTE: You need to generate the Q4.dat file youself
*/
public class Q4_2017 {
    public static void main(String[] args) {
        generateDat();
        try{
            ObjectInputStream i = new ObjectInputStream(new FileInputStream("Q4.dat"));
            
            try{
                while(true) {
                    String date = i.readUTF();
                    int q = Integer.parseInt(date.substring(0, 2));
                    int m = Integer.parseInt(date.substring(2, 4));
                    int y = Integer.parseInt(date.substring(4));
                    Q4_DayOfTheWeek d = new Q4_DayOfTheWeek(q,m,y);
                    System.out.printf("%d/%d/%d is %s\n",q,m,y,d.display());
                }
            } catch(EOFException ee) {}
            i.close();
        } catch(Exception e) {
            System.out.println("Error");
        }
    }
    
    public static void generateDat() {
        try{
            ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream("Q4.dat"));
            w.writeUTF("25032017");
            w.writeUTF("29022100");
            w.writeUTF("19012017");
            w.writeUTF("31092015");
            w.writeUTF("31052017");
            w.writeUTF("29022016");
            w.close();
        } catch(Exception e) {
            
        }
    }
}
