
package PYQ2020;

public class Q5_Cloud {
    private String cloudPackage;
    protected double totalCost;
    
    public Q5_Cloud(String name, double cost) {
        this.cloudPackage = name;
        this.totalCost = cost;
    }
    
    public double getTotalCost() {
        return totalCost;
    }
    
    @Override
    public String toString() {
        return "Cloud Package : " + cloudPackage + " Total cost : " + totalCost;
    }
}
