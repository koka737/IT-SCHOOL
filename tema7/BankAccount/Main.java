package tema7.BankAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount( 500);

        System.out.println("Account balance: $" + account.getBalance());

        account.withdraw(50);
        account.deposit(200);


        System.out.println("Account balance: $" + account.getBalance());
    }
}
