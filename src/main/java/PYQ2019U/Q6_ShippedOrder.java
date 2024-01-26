
package PYQ2019U;

public class Q6_ShippedOrder extends Q6_Order {
    public Q6_ShippedOrder(String customerName, String customerID, int quantity, double unitPrice) {
        super(customerName,customerID,quantity,unitPrice);
    }
    
    @Override
    public double computeTotalPrice() {
        return (quantity * unitPrice) + 4;
    }
    
    public String toString() {
        return "\nShipped\n" + super.toString();
    }
}
