
package PYQ2017U;

public class Q5_PartTimeStaff extends Q5_Staff {
    int hours;
    
    public Q5_PartTimeStaff(String name, String IC, int hours) {
        super(name,IC);
        this.hours = hours;
    }
    
    public int getSalary() {
        return hours * 40;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNumber of working hours: " + hours + "\nSalary: RM" + getSalary();
    }
}
