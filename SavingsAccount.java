package unit5assign7;

public class SavingsAccount extends BankAccount{
    private double interest = 0;
    
    public SavingsAccount(int accountNum) {
        super(accountNum);
        interest = 0;
    }
    
    public SavingsAccount(double interest, int accountNum) {
        super(accountNum);
        this.interest = interest;
    }
    
    public double getInterest() {
        return interest;
    }
    
    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    public void addInterest() {
        deposit(interest*getBalance());
    }
    
    @Override
    public String toString() {
        return super.getAccountNumber() + "/SavingsAccount/Money:" + getBalance();
    }
}
