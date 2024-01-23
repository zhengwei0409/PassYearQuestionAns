
package PYQ2018;

public abstract class Q5_Fruit {
    String name,type;
    
    public Q5_Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalPrice();
    
    @Override
    public String toString() {
        return type + " " + name + " - ";
    }
}
