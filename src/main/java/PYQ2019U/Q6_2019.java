
package PYQ2019U;

import java.util.Scanner;

public class Q6_2019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name, id;
        int quantity;
        double pricePerUnit;
       
        System.out.print("Enter customer name :");
        name = s.nextLine();
        System.out.print("Enter customer id :");
        id = s.nextLine();
        System.out.print("Enter quantity ordered :");
        quantity = s.nextInt();
        System.out.print("Enter price per unit :");
        pricePerUnit = s.nextDouble();
        System.out.println("");
        
        Q6_Order o = new Q6_Order(name,id,quantity,pricePerUnit);
        System.out.println(o.toString());
        
        Q6_ShippedOrder so = new Q6_ShippedOrder(name,id,quantity,pricePerUnit);
        System.out.println(so.toString());
        
    }
}
