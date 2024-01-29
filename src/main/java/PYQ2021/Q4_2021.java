
package PYQ2021;

public class Q4_2021 {
    public static void main(String[] args) {
        Q4_DevideF1 a = new Q4_DevideF1("data.dat");
        Q4_DevideF2 b = new Q4_DevideF2("data.dat");
        display(a);
        display(b);
    }
    
    public static void display(Q4_Eleven el) {
        System.out.println(el.divide());
    }
}
