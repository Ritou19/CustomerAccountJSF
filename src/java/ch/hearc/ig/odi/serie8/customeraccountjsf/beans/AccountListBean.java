package ch.hearc.ig.odi.serie8.customeraccountjsf.beans;


import ch.hearc.ig.odi.serie8.customeraccountjsf.business.Account;
import ch.hearc.ig.odi.serie8.customeraccountjsf.business.Customer;
import ch.hearc.ig.odi.serie8.customeraccountjsf.services.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

@Named(value = "accountListBean")
//@Dependent
@SessionScoped


public class AccountListBean implements Serializable{

    /**
     * Creates a new instance of AccountListBean
     */
    
    @Inject Services services;
    private Customer cli;
    private DataModel<Account> lesComptes;
    
    
    public AccountListBean() {
    }
    
    public String recupClient(Customer customer){
        this.cli = customer;
        return "Success";
    }

    public Customer getCli() {
        return cli;
    }

    public void setCli(Customer cli) {
        this.cli = cli;
    }
    
    public DataModel<Account> getLesComptes(){
        lesComptes = new ListDataModel<Account>();
        lesComptes.setWrappedData(services.getAccountListByCli(cli.getNumber()));
        return lesComptes;
    }    
}