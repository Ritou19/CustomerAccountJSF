package ch.hearc.ig.odi.serie8.customeraccountjsf.business;

import java.util.Date;

public class Individual extends Customer {

    private Date birthDate;
    private String email;
    private String firstName;
    private String lastName;

    public Individual(Integer number, String firstname, String lastName, Date birthDate, String email) {
        super(number);
        this.birthDate = birthDate;
        this.email = email;
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public Individual(Integer number, String firstname, String lastName) {
        super(number);
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
