
package PYQ2019U;

public class Q6_Order {
    protected String name,id;
    protected int quantity;
    protected double unitPrice;
    
    public Q6_Order() {
        this.name = "";
        this.id = "";
        this.quantity = 0;
        this.unitPrice = 0;
    }
    
    public Q6_Order(String customerName, String customerID, int quantity, double unitPrice) {
        this.name = customerName;
        this.id = customerID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public String getCustomerName() {
        return name;
    }

    public String getCustomerID() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setCustomerName(String customerName) {
        this.name = customerName;
    }

    public void setCustomerID(String customerID) {
        this.id = customerID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice() {
        return quantity * unitPrice;
    }
    
    public String toString() {
        return "Order Record \nCustomer Name : " + name + "\nCustomer ID : " + id + "\nQuantity Order : " + quantity + "\nUnitPrice : " + unitPrice + "\nTotal Price : " + computeTotalPrice();
    }
}
