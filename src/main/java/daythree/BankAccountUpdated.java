package daythree;

public class BankAccountUpdated {

    private double balance;

    public BankAccountUpdated() {
        this.balance = 0;
    }

    public BankAccountUpdated(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {

        if (amount > 5000) System.out.printf("Transaction canceled. " +
                "Max deposit - 5000 | Your deposit: %f%n", amount);
        else this.balance += amount;
        return this.getBalance();
    }

    public double withdraw(double amount) {

        if (amount > this.balance) System.out.println("There is not enough funds.");
        else this.balance -= amount;
        return this.getBalance();
    }

    public double transferFrom(BankAccountUpdated destination, double amount) {

        if (amount > this.balance) System.out.printf("Transfer canceled. " +
                "You are trying to transfer %f units, but only %f are available.", amount, this.balance);
        else {
            this.balance -= amount;
            destination.balance += amount;
        }
        return this.getBalance();
    }

}
