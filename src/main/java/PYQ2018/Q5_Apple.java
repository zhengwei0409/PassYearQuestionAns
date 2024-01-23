
package PYQ2018;


public class Q5_Apple extends Q5_Fruit {
    
    int quantity;
    
    public Q5_Apple(String name, String type, int quantity) {
        super(name,type);
        this.quantity = quantity;
    }

    @Override
    public double totalPrice() {
        if(type.equalsIgnoreCase("Green")) {
            return quantity * 1.2;
        } else {
            return quantity * 1.8;
        }
    }
    
    @Override
    public String toString() {
        return  super.toString() + quantity + " = RM " + totalPrice();
    }

}
