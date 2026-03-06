import java.util.Stack;

public class BankAccount {

    int accNo;
    String name;
    double balance;

    Stack<String> transactions = new Stack<>();

    // constructor
    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    // deposit money
    void deposit(double amount) {
        balance = balance + amount;

        transactions.push("Deposited : " + amount);

        System.out.println("Money Deposited");
    }

    // withdraw money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;

            transactions.push("Withdrawn : " + amount);

            System.out.println("Money Withdrawn");
        }
    }

    // check balance
    void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }

    // show transactions
    void showTransactions() {
        System.out.println("Transaction History:");

        for (String t : transactions) {
            System.out.println(t);
        }
    }

    // undo last transaction
    void undo() {
        if (transactions.isEmpty()) {
            System.out.println("No transaction to undo");
            return;
        }

        String last = transactions.pop();

        System.out.println("Last transaction removed : " + last);
    }
}