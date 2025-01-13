package gr.aueb.cf.ch13.exercises.bankapp.model;

import gr.aueb.cf.ch13.exercises.bankapp.AccountHW;

/**
 * Defines an {@link OverfraftAccount} class which extends AccountHW.
 * This class allows overdraft withdrawals beyond account balance.
 */
public class OverfraftAccount extends AccountHW {

    public OverfraftAccount() {
    }

    public OverfraftAccount(int id, String iban, String firstname, String lastname, String ssn, Double balance) {
        super(id, iban, firstname, lastname, ssn, balance);
    }

    /**
     * Withdraws a certain amount of money from the OverfraftAccount.
     * Allows overdrafts even if balance goes below zero.
     * @param amount    the amount of money to be withdrawn.
     * @param ssn       the SSN to validate withdrawal.
     * @throws Exception if the withdrawal conditions are not met.
     */
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
