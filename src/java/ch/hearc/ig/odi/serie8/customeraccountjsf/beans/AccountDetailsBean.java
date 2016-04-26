package ch.hearc.ig.odi.serie8.customeraccountjsf.beans;

import ch.hearc.ig.odi.serie8.customeraccountjsf.business.Account;
import ch.hearc.ig.odi.serie8.customeraccountjsf.services.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value = "accountDetailsBean")
//@Dependent
@SessionScoped

public class AccountDetailsBean implements Serializable{

    /**
     * Creates a new instance of AccountDetailsBean
     */
    
    @Inject Services services;
    private String number;
    private String name;
    private Double rate;
    private Double balance;


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
    public AccountDetailsBean() {
    }
    
    public String recupAccount(Account account){
        this.number = account.getNumber();
        this.name = account.getName();
        this.rate = account.getRate();
        this.balance = account.getBalance();
        return "Success";
    }
}
