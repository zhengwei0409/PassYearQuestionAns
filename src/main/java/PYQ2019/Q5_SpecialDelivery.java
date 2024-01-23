
package PYQ2019;

public class Q5_SpecialDelivery extends Q5_Delivery {
    private boolean weekendDelivery, nighttimeDelivery;
    
    public Q5_SpecialDelivery(String sender, String recipient, double weight, boolean weekendDelivery, boolean nighttimeDelivery) {
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nighttimeDelivery = nighttimeDelivery;
    }
    
    @Override
    public double totalCost() {
        if(weekendDelivery && nighttimeDelivery) {
            return (super.totalCost() + 50) * 1.2; // use super to invoke the parent method
        } else if(weekendDelivery) {
            return super.totalCost() + 50;
        } else if(nighttimeDelivery) {
            return super.totalCost() * 1.2;
        } else {
            return super.totalCost();
        }
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        if(weekendDelivery) {
            result += "\nWeekend Delivery";
        }
        if(nighttimeDelivery) {
            result += "\nNight Time Delivery";
        }
        return result;
    }
}
