
package PYQ2019U;

public class Q4_Pizza {
    private String size;
    private int numOfCheeseTopping, numOfBeefTopping, numOfChickenTopping, totalTopping;
    
    public Q4_Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    
    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost() {
        int totalTopping = numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping;
        if(size.equalsIgnoreCase("Small")) {
            return 10 + totalTopping * 2;
        } else if(size.equalsIgnoreCase("Medium")) {
            return 12 + totalTopping * 2;
        } else {
            return 14 + totalTopping * 2;
        }
    }
    
    public void display(){
        System.out.println("Pizza size: " + size);
        System.out.println("Number of Cheese Topping: " + numOfCheeseTopping);
        System.out.println("Number of Beef Topping: " + numOfBeefTopping);
        System.out.println("Number of Chicken Topping: " + numOfChickenTopping);
        System.out.println("Cost: $ " + computeCost());
    }
}
