
package PYQ2018;

public class Q5_2018 {
    public static void main(String[] args) {
        Q5_Apple a1 = new Q5_Apple("Apple","Red",8);
        Q5_Apple a2 = new Q5_Apple("Apple","Green",11);
        Q5_Watermelon w1 = new Q5_Watermelon("Watermelon","Local",7.6);
        Q5_Watermelon w2 = new Q5_Watermelon("Watermelon","Imported",4);
        
        Q5_Fruit[] arr = {a1,a2,w1,w2};
        Q5_Fruit cheapestFruit = a1; // initialize a random value first
        double cheapest = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].totalPrice()<cheapest) {
                cheapest = arr[i].totalPrice();
                cheapestFruit = arr[i]; 
            }
        }

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println("The cheapest item is");
        System.out.println(cheapestFruit.toString());
        
    }
}
