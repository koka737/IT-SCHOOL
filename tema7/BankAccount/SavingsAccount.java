package tema7.BankAccount;

public class SavingsAccount extends BankAccount {
    public SavingsAccount( double initialBalance) {
        super( initialBalance); // Call the superclass constructor with the account number and initial balance.
    }


    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance of $100 must be maintained.");
        }
    }
}
