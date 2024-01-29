
package PYQ2021;

import java.io.*;

public abstract class Q4_Eleven {
    protected int[] arr;
    protected String file;
    
    public Q4_Eleven (String file) {
        this.file = file;

        try{
            // cuz we dont have the actual file, we need to write it ourself
            ObjectOutputStream wr = new ObjectOutputStream(new FileOutputStream(file));
            wr.writeInt(802);
            wr.writeInt(190817);
            wr.writeInt(50346340);
            
            wr.close();
            
            ObjectInputStream rd = new ObjectInputStream(new FileInputStream(file));
            int cnt = 0;
            try{
                while(true) {
                    rd.readInt();
                    cnt++;
                }
            } catch (EOFException ee) {}
            
            rd = new ObjectInputStream(new FileInputStream(file));
            arr = new int[cnt];
            int index = 0;
            
            try{
                while(true) {
                    arr[index++] = rd.readInt();
                }
            } catch (EOFException ee) {}
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public abstract String divide();
}
