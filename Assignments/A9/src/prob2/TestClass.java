package prob2;

public class TestClass {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("Joao", "ACC123", 500.0);

        // 1. Deposit with negative input -> IllegalArgumentException
        try {
            account.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 2. Withdraw more than balance -> AccountException with "Insufficient funds..." message
        try {
            account.withdraw(600);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        // 3. Withdraw valid amount that drops below $100 -> AccountException with "Low balance warning..." message
        try {
            account.withdraw(450);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        // 4. Successful deposit and withdraw
        try {
            account.deposit(200);
            System.out.printf("Deposit successful. Balance: $%.2f%n", account.getBalance());

            account.withdraw(300);
            System.out.printf("Withdrawal successful. Balance: $%.2f%n", account.getBalance());
        } catch (IllegalArgumentException | AccountException e) { // Short way to catch multiple exceptions
            System.out.println(e.getMessage());
        }
    }
}