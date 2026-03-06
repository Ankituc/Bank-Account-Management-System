import java.util.ArrayList;

public class BankSystem {

    ArrayList<BankAccount> list = new ArrayList<>();

    // create account
    void createAccount(int accNo, String name, double balance) {
        BankAccount b = new BankAccount(accNo, name, balance);

        list.add(b);

        System.out.println("Account Created");
    }

    // search account
    BankAccount searchAccount(int accNo) {
        for (BankAccount b : list) {
            if (b.accNo == accNo) {
                return b;
            }
        }

        return null;
    }

}