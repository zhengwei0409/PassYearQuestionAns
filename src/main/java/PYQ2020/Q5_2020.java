
package PYQ2020;

public class Q5_2020 {
    public static void main(String[] args) {
        
        Q5_Job j1 = new Q5_Job("J1",252,20);
        Q5_Job j2 = new Q5_Job("J2",108,10);
        Q5_Job j3 = new Q5_Job("J3",72,25);
        
        Q5_CloudPackage a = new Q5_CloudPackage("P2-15",4,15,1.24);
        Q5_CloudPackage b = new Q5_CloudPackage("P2-30", 6, 30, 2.11);
        Q5_CloudPackage c = new Q5_CloudPackage("R5-20", 4, 20, 1.38);
        Q5_CloudPackage d = new Q5_CloudPackage("R6-20", 6, 20, 1.88);
        
        Q5_Job listOfJobs[] = {j1,j2,j3};
        Q5_CloudPackage listOfPackages[] = {a,b,c,d};
        
        double totalCost = 0;
        for(Q5_Job j : listOfJobs) {
            Q5_CloudPackage cheapestPac = new Q5_CloudPackage("temp", 1, 1, 1000000);;
            for(Q5_CloudPackage cp : listOfPackages) {
                if(cp.check(j) && cp.totalCost(j) < cheapestPac.totalCost(j)) {
                    cheapestPac = cp;
                }
            }
            totalCost += cheapestPac.totalCost(j);
            System.out.println(j.toString());
            System.out.println(cheapestPac.toString());
        }
        System.out.printf("Total cost %.2f",totalCost);
    }
}
