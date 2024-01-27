
package PYQ2016U;

public class Q6_2016 {
    public static void main(String[] args) {
        System.out.println("The information about financial record A is as follow:");
        Q6_FinancialRecord a = new Q6_FinancialRecord(1234,10000);
        a.setAnnualInterestRate(7.7);
        a.displayRecordInfo();
        System.out.println();
        System.out.println("The information about financial record B is as follow:");
        Q6_FinancialRecord b = new Q6_FinancialRecord(1235,20000);
        b.setAnnualInterestRate(8);
        b.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + b.getMonthlyInterestRate());
        b.deposit(1500);
        b.withdraw(500);
    }
}
