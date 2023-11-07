package tema7.BankAccount;

public class BankAccount {

    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }

    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Withdrawal amount must be greater than 0 and less than or equal to the account balance.");
        }

    }

    public double getBalance() {
        return balance;
    }


}
