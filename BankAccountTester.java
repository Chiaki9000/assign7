package unit5assign7;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount[] test = new BankAccount[3];
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                ChequingAccounts b = new ChequingAccounts(-5, i + 4000);
                b.withdraw(10);
                test[i] = b;
            } else {
                SavingsAccount b= new SavingsAccount(0.04, i + 4000);
                b.deposit(100);
                test[i] = b;
            }
        }
        
        Bank b = new Bank(test);
        System.out.println(b.toString());
        b.update();
        System.out.println(b.toString());

//        SavingsAccount x = new SavingsAccount(0.04, 4);
//        x.deposit(100);
//        System.out.println(x.getBalance());
//        x.addInterest();
//        System.out.println(x.getBalance());
    }
    
}
