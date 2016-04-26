package ch.hearc.ig.odi.serie8.customeraccountjsf.business;

public class Company extends Customer {

    String companyName;
    String phone;
    String fax;

    public Company(Integer number, String firstName, String lastName, String phone, String fax, String companyName) {
        super(number);
        this.phone = phone;
        this.fax = fax;
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}