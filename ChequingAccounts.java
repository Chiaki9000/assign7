package unit5assign7;

public class ChequingAccounts extends BankAccount{
    private double overDraftLimit;
    
    public ChequingAccounts(int accountNum) {
        super(accountNum);
        overDraftLimit = 0;
    }
    
    public ChequingAccounts(double overDraftLimit, int accountNum) {
        super(accountNum);
        this.overDraftLimit = overDraftLimit;
    }
    
    public double getOverDraftLimit() {
        return overDraftLimit;
    }
    
    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    
    
    @Override
    public String toString() {
        return super.getAccountNumber() + "/CheckingAccount";
    }
}
