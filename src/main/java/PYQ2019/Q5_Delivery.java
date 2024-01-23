
package PYQ2019;

public class Q5_Delivery {
    private String sender, recipient;
    private double weight;
    
    public Q5_Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost() {
        if(weight <= 5) {
            return weight * 2.8;
        } else if(weight <=20) {
            return (weight-5) * 5.2 + (5*2.8);
        } else if(weight <= 50) {
            return (weight-20) *  7 + (15*5.2) + (5*2.8); 
        } else {
            return (weight-50) * 8.6 + (30*7) + (15*5.2) + (5*2.8);
        }
    }
    
    @Override
    public String toString() {
        return "From : "  + sender + " To: " + recipient + "\nWeight of Package : " + weight + " kg" + "\nShipping cost : "  + totalCost();
    }
}
