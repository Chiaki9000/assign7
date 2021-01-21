package unit5assign7;

public class BankAccount {
    private double balance;  
    private int accountNum;  
    
    public BankAccount (int accountNum) {    
	this.balance = 0.0;
	this.accountNum = accountNum;
    }
    
    public void deposit(double sum) {
	if (sum > 0)
	    this.balance += sum;    
	else
	    System.err.println("Account.deposit(...): "
			       +"cannot deposit negative amount.");    
    }
    
    public void withdraw(double sum) {
	if (sum > 0)
	    this.balance -= sum;    
	else
	    System.err.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");    
    }
    
    public double getBalance() {
	return this.balance;
    }
    
    public double getAccountNumber() {
	return this.accountNum;
    }
    
    @Override
    public String toString()  {
	return "Account Number: " + this.accountNum + ": " + "Balance: $" + this.balance;    
    }
    
}
    