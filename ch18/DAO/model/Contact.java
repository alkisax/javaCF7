package gr.aueb.cf.exercises.ch18.DAO.model;

import java.util.Objects;

public class Contact extends AbstractEntity{
    private String firstname;
    private String lastname;
    private String password;
    private String username;

    public Contact(){}

    public Contact(long id, String firstname, String lastname, String password, String username) {
        setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getFirstname(), contact.getFirstname()) && Objects.equals(getLastname(), contact.getLastname()) && Objects.equals(getPassword(), contact.getPassword()) && Objects.equals(getUsername(), contact.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPassword(), getUsername());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
