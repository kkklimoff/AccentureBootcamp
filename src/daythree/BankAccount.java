package daythree;

public class BankAccount {
    double balance;

    public BankAccount() {

    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void printBalance() {
        System.out.printf("Current balance: %f%n", this.balance);
    }

    public void transferFrom(BankAccount destination, double amount) {

        this.balance -= amount;
        destination.balance += amount;
    }
}
