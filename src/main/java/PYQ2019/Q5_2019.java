
package PYQ2019;

public class Q5_2019 {
    public static void main(String[] args) {
        Q5_Delivery ali = new Q5_Delivery("Ali","Ahmad",4.4);
        Q5_Delivery chong = new Q5_Delivery("AH Chong","Fatimah",63.1);
        Q5_SpecialDelivery fsktm = new Q5_SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        Q5_SpecialDelivery ang = new Q5_SpecialDelivery("Ang","Liewwww",19,true,true);
        
        double totalCost = ali.totalCost() + chong.totalCost() + fsktm.totalCost() + ang.totalCost();
        
        System.out.println(ali.toString());
        System.out.println();
        System.out.println(chong.toString());
        System.out.println();
        System.out.println(fsktm.toString());
        System.out.println();
        System.out.println(ang.toString());
        System.out.println();
        System.out.println("The total shipping cost is RM " + totalCost);
    }
}
