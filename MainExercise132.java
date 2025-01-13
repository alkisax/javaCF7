package gr.aueb.cf.ch13.exercises;

import gr.aueb.cf.ch13.Account;
import gr.aueb.cf.ch13.exercises.bankapp.JointAccount;
import gr.aueb.cf.ch13.exercises.bankapp.OverfraftAccount;

public class MainExercise132 {
    public static void main(String[] args) {
        AccountHW account = new AccountHW(1, "GR12312343", "Alice", "Wonderland", "s12341", 1000.0);

        OverfraftAccount overAccount = new OverfraftAccount(1, "GR12312343", "Alice", "Wonderland", "s12341", 1000.0);

        overTester(overAccount, account);

        JointAccount jointAccount = new JointAccount(2,"GR12312343","Alice","Wonderland", "s12341", 1000.0, "Bob", "Squarepants");

        jointTester(jointAccount);

//        tester((account));
    }
    public static void tester(Account account) {
        try {
            account.deposit(900);
            System.out.println("The deposit was successfull");

            account.withdraw(500, "R123");

            account.withdraw(200, "s12341");
            System.out.println( " sucsessfull");

            System.out.println("Balance: " + account.getAccountBalance());

            System.out.println(account.accountToString());

        } catch (Exception e) {
            // expect invalid
            System.out.println(e.getMessage());
        }
    }

    public static void overTester (OverfraftAccount overAccount, AccountHW account){
        System.out.println("Balance account: " + account.getBalance());
        System.out.println("Withdrawing 1001 (more than balance, expect problem) from AccountHW:");
        try {
            account.withdraw(1001.0, "s12341");  // Using the AccountHW method
        } catch (Exception e) {
            System.err.println("Error during withdrawal on AccountHW: " + e.getMessage());
        }

        System.out.println("Balance OverfraftAccount : " + account.getBalance());
        System.out.println("Withdrawing 1001 (more than balance, do not expect problem) from OverfraftAccount:");
        try {
            overAccount.withdraw(1001.0, "s12341");
            System.out.println("New balance: " + overAccount.getBalance());
        } catch (Exception e) {
            System.err.println("Error during withdrawal on AccountHW: " + e.getMessage());
        }
    }

    public static void jointTester (JointAccount jointAccount) {
        System.out.println("first name: " + jointAccount.getFirstname());
        System.out.println("first lastname: " + jointAccount.getLastname());
        System.out.println("second name: " + jointAccount.getFirstname2nd());
        System.out.println("second lastname: " + jointAccount.getLastname2nd());
    }
}
