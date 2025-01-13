package gr.aueb.cf.ch13.exercises.bankapp;
import gr.aueb.cf.ch13.exercises.AccountHW;

public class OverfraftAccount extends AccountHW{


    public OverfraftAccount() {
    }

    public OverfraftAccount(int id, String iban, String firstname, String lastname, String ssn, Double balance) {
        super(id, iban, firstname, lastname, ssn, balance);

    }

    @Override
    public void withdraw (double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("SSN " + ssn + " is not valid");
            }
            if (amount > super.getBalance()) {
                System.out.println("Overdraft allowed, balance will go below zero.");
            }
            if (amount < 0) {
                throw new Exception("The amount must not be negative");
            }
            super.setBalance(super.getBalance() - amount);
            System.out.println("Amount " + amount + " successfully withdrew");
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}
