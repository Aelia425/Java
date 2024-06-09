package BankExercise;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Error: The deposit money should be positive number.");
        }
    }

    public void withdraw(double amount){
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Error: The amount you want to withdraw is more than the available funds.");
            }
        } else {
            System.out.println("Error: The withdrawal amount should be positive");
        }
    }

    public void displayBalance(){
//        System.out.println("New Balance: $"+this.balance);
        System.out.printf("New Balance: $%.2f\n",this.balance);

    }

}
