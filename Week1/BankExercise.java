package BankExercise;

public class BankExercise {
    public static void main(String[] args) {
        BankAccount account_1 = new BankAccount(1000);

        System.out.printf("Opening balance: $%.2f\n",account_1.getBalance());
        System.out.println("Depositing $500.00...");
        account_1.deposit(500);
        account_1.displayBalance();
        System.out.println("Withdrawing $200.00...");
        account_1.withdraw(200);
        account_1.displayBalance();

    }
}
