
package PYQ2016;

public class Q5_Point extends Q5_CreditCard {
    public Q5_Point(String name, String number) {
        super(name, number, "Point Reward");
    }
    
    public void getReward(String day,double purchaseValue) {
        if(day.equalsIgnoreCase("Friday")) {
            reward += purchaseValue * 2 * 0.01;
        } else if(day.equalsIgnoreCase("Saturday")) {
            reward += purchaseValue * 3 * 0.01;
        } else if(day.equalsIgnoreCase("Sunday")) {
            reward += purchaseValue * 4 * 0.01;
        } else {
            reward += purchaseValue * 0.01;
        }
    }
}
