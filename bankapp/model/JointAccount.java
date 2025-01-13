package gr.aueb.cf.ch13.exercises.bankapp.model;

import gr.aueb.cf.ch13.exercises.bankapp.AccountHW;

/**
 * Defines a {@link JointAccount} class which extends AccountHW.
 * This class allows multiple account holders to share an account.
 */
public class JointAccount extends AccountHW {
    private String firstname2nd;
    private String lastname2nd;

    public JointAccount(int id, String iban, String firstname, String lastname, String ssn, Double balance, String firstname2nd, String lastname2nd) {
        super(id, iban, firstname, lastname, ssn, balance);
        this.firstname2nd = firstname2nd;
        this.lastname2nd = lastname2nd;
    }

    public String getFirstname2nd() {
        return firstname2nd;
    }

    public void setFirstname2nd(String firstname2nd) {
        this.firstname2nd = firstname2nd;
    }

    public String getLastname2nd() {
        return lastname2nd;
    }

    public void setLastname2nd(String lastname2nd) {
        this.lastname2nd = lastname2nd;
    }
}
