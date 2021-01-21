package unit5assign7;

public class Bank {
    private BankAccount[] bankAccount;
    
    public Bank(BankAccount[] bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    public void update() {
        for (int i = 0; i < bankAccount.length; i++) {
            if (bankAccount[i] instanceof ChequingAccounts) {
                ChequingAccounts x = (ChequingAccounts)bankAccount[i];
                if (x.getBalance() < x.getOverDraftLimit()) {
                    System.out.println(x.getAccountNumber() + " exceeded overdraft limit");
                }
            } else if (bankAccount[i] instanceof SavingsAccount) {
                SavingsAccount x = (SavingsAccount)bankAccount[i];
                x.addInterest();
            }
        }
    }
    
    @Override
    public String toString() {
        String x = "";
        for (BankAccount i : bankAccount) {
            x += i.toString() + "\n";
        }
        return x;
    }
}
