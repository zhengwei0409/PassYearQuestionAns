
package PYQ2016U;

public class Q6_FinancialRecord {
    private int id;
    private double balance, annualInterestRate;
    
    public Q6_FinancialRecord() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }
    
    public Q6_FinancialRecord(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    
    public void withdraw(double w) {
        System.out.println("Previous balance: RM" + balance);
        balance -= w;
        System.out.println("Current balance after withdrawal of RM" + w + " is: RM" + balance);
    }
    
    public void deposit(double d) {
        System.out.println("Previous balance: RM" + balance);
        balance += d;
        System.out.println("Current balance after deposit of RM" + d + " is: RM" + balance);
    }
    
    public void displayRecordInfo() {
        System.out.println("Financial record id is: " + id);
        System.out.println("Financial record balance is: RM" + balance);
        System.out.println("Annual interest rate is: " + annualInterestRate);
        
    }
}
