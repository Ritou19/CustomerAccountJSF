package ch.hearc.ig.odi.serie8.customeraccountjsf.beans;

import ch.hearc.ig.odi.serie8.customeraccountjsf.services.Services;
import ch.hearc.ig.odi.serie8.customeraccountjsf.business.Customer;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

@Named(value = "customersBean")
//@Dependent
@SessionScoped

public class CustomersBean implements Serializable {

    @Inject
    Services services;
    private DataModel<Customer> lesClients;

    /**
     * Creates a new instance of CustomersBean
     */
    public CustomersBean() {
    }

    public DataModel<Customer> getLesClients() {
        lesClients = new ListDataModel<Customer>();
        lesClients.setWrappedData(services.getCustomersList());
        return lesClients;
    }
}
