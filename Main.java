import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankSystem bank = new BankSystem();

        int choice;

        do {

            System.out.println("\nBANK SYSTEM MENU");

            System.out.println("1 Create Account");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Check Balance");
            System.out.println("5 Show Transactions");
            System.out.println("6 Undo Last Transaction");
            System.out.println("7 Exit");

            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            int accNo;
            BankAccount acc;

            switch (choice) {

                case 1:

                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();

                    System.out.print("Enter name: ");
                    String name = sc.next();

                    System.out.print("Enter starting balance: ");
                    double bal = sc.nextDouble();

                    bank.createAccount(accNo, name, bal);

                    break;

                case 2:

                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();

                    acc = bank.searchAccount(accNo);

                    if (acc != null) {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();

                        acc.deposit(amt);
                    } else {
                        System.out.println("Account not found");
                    }

                    break;

                case 3:

                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();

                    acc = bank.searchAccount(accNo);

                    if (acc != null) {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();

                        acc.withdraw(amt);
                    } else {
                        System.out.println("Account not found");
                    }

                    break;

                case 4:

                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();

                    acc = bank.searchAccount(accNo);

                    if (acc != null)
                        acc.checkBalance();

                    else
                        System.out.println("Account not found");

                    break;

                case 5:

                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();

                    acc = bank.searchAccount(accNo);

                    if (acc != null)
                        acc.showTransactions();

                    else
                        System.out.println("Account not found");

                    break;

                case 6:

                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();

                    acc = bank.searchAccount(accNo);

                    if (acc != null)
                        acc.undo();

                    else
                        System.out.println("Account not found");

                    break;

            }

        }

        while (choice != 7);

    }

}