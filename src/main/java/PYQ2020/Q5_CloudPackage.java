
package PYQ2020;

public class Q5_CloudPackage extends Q5_Cloud{
    private int coreNum, memory;
    private double pricePerHour;
    
    public Q5_CloudPackage(String name,int coreNum, int memory, double pricePerHour) {
        super(name,0);
        this.coreNum = coreNum;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean check(Q5_Job a) {
        return memory >= a.getMemory();
    }
    
    public double totalCost(Q5_Job a) {
        totalCost = a.getNumberOfTask() / coreNum * pricePerHour;
        return totalCost;
    }
}
