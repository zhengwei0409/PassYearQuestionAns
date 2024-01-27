
package PYQ2017U;

public class Q5_Staff {
    protected String name,IC;
    
    public Q5_Staff(String name, String IC) {
        this.name = name;
        this.IC = IC;
    }
    
    public String toString() {
        return "Full Name: " + name + "\nIC: " + IC;
    }
}
