
package PYQ2017;


public class Q4_Complex {
    int real, imaginary;
    
    public Q4_Complex() {
        // idk what this constructor do
    }
    
    public Q4_Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public Q4_Complex addComplexNum(Q4_Complex c) {
        int r = this.real + c.real;
        int i = this.imaginary + c.imaginary;
        Q4_Complex result = new Q4_Complex(r,i);
        return result;
    }
    
    public Q4_Complex subtractComplexNum(Q4_Complex c) {
        int r = this.real - c.real;
        int i = this.imaginary - c.imaginary;
        Q4_Complex result = new Q4_Complex(r,i);
        return result;
    }
    
    @Override
    public String toString() {
        return "(" + this.real + " + " + this.imaginary + "i)";
    }
    
}
