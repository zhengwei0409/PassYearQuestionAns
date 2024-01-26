
package PYQ2019U;

public class Q5_QuadraticEquation {
    private int a,b,c;
    
    public Q5_QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double discriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }
    
    public double calcRoot1() {
        if(discriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(discriminant())) / (2 * a);
        }
    }
    
    public double calcRoot2() {
        if(discriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(discriminant())) / (2 * a);
        }
    }
}
