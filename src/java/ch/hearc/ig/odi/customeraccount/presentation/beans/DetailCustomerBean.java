/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.presentation.beans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author stephane.grangier
 */
@Named
@SessionScoped
public class DetailCustomerBean implements Serializable {
    @Inject Services services;

    private Customer customer;
    private DataModel<Account> lesAccountDM;

    /**
     * Creates a new instance of detailCustomerBean
     */
    public DetailCustomerBean() {
    }

    public DataModel<Account> getlesAccountDM() {
        lesAccountDM = new ListDataModel<Account>();
        lesAccountDM.setWrappedData(customer.getAccountsList()); //injecter de la classe services*/
        return lesAccountDM;
    }
    
    

    public String showCustomer(Customer customer) {
        this.customer = customer;
        return "details";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
