package daythree;

public class Task3and4 {

    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount(2500);
        BankAccount secondAccount = new BankAccount(0);

        secondAccount.transferFrom(firstAccount, 20.50);
        secondAccount.printBalance();
        firstAccount.withdraw(6000);
        firstAccount.printBalance();


        BankAccountUpdated firstUpdAccount = new BankAccountUpdated(300.70);
        BankAccountUpdated secondUpdAccount = new BankAccountUpdated(600.25);

        firstUpdAccount.withdraw(399.99);
        secondUpdAccount.deposit(14999.99);

        firstUpdAccount.transferFrom(secondUpdAccount, 500);
    }
}
