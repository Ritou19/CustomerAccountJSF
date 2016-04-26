package ch.hearc.ig.odi.serie8.customeraccountjsf.beans;

import ch.hearc.ig.odi.serie8.customeraccountjsf.services.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

@Named(value = "customerCreateBean")
//@Dependent
@SessionScoped

public class CustomerCreateBean implements Serializable {

    @Inject
    Services services;
    private Integer number = null;
    private String lastName = null;
    private String firstName = null;

    /**
     * Creates a new instance of CustomerCreateBean
     */
    public CustomerCreateBean() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String save() {
        String result;
        services.saveCustomer(number, firstName, lastName);
        result = "Success";
        return result;
    }
}
