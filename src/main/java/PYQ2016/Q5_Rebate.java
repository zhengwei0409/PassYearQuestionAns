
package PYQ2016;

public class Q5_Rebate extends Q5_CreditCard {
    public Q5_Rebate(String name, String number) {
        super(name,number,"Cash Rebate");
    }
    
    public void getReward(String type,double purchaseValue) {
        if(type.equalsIgnoreCase("Fuel")) {
            reward += purchaseValue * 0.08;
        } else if(type.equalsIgnoreCase("Utility")) {
            reward += purchaseValue * 0.05;
        } else if(type.equalsIgnoreCase("Grocery")) {
            reward += purchaseValue * 0.02;
        } else {
            reward += purchaseValue * 0.002;
        }
    }
}
