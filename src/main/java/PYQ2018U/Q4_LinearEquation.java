
package PYQ2018U;

public class Q4_LinearEquation {
    private int a, b, c, d, e, f;
    
    public Q4_LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public String toString() {
        return a + "x + " + b + "y = " + e + "\n" + c + "x + " + d + "y = " + f;
    }
    
    public boolean isSolvable() {
        return (a*d) - (b*c) != 0;
    }
    
    public double computeX() {
        return ((e*d) - (b*f)) / (double) ((a*d) - (b*c));
    }
    
    public double computeY() {
        return ((a*f) - (e*c)) / (double) ((a*d) - (b*c));
    }
}
