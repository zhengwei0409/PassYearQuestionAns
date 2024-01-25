
package PYQ2016;


public class Q5_CreditCard {
    protected String name, number, type;  
    protected double reward = 0;
    
    public Q5_CreditCard(String name, String number, String type) {
        this.name = name;
        this.number = number;
        this.type = type;
    }
    
    public String getTotalReward() {
        if(type.equalsIgnoreCase("Cash Rebate")) {
            return String.valueOf(this.reward); // String.valueof() convert double to String
        } else {
            return String.format("%.1f", this.reward); 
        }
        
    }
    
    public void setTotalReward(double value) {
        this.reward = value;
    }
    
    @Override
    public String toString() {
        return "Credit card : " + name + " (" + number + ") \nCard Type : " + type + "\nTotal Cash Reward : " + getTotalReward();
    }
    
}
