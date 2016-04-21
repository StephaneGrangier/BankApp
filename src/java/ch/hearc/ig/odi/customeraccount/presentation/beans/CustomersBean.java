package ch.hearc.ig.odi.customeraccount.presentation.beans;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephane.grangier
 */

@Named
@SessionScoped
public class CustomersBean implements Serializable {
    @Inject Services services;

   private DataModel<Customer> lesCustomersDM;
    
    public CustomersBean() {
    }
    
    public DataModel<Customer> getLesCustomersDM(){
        lesCustomersDM = new ListDataModel<Customer>();
        lesCustomersDM.setWrappedData(services.getCustomersList()); //injecter de la classe services
        return lesCustomersDM;
    }
    
    public Customer getCustomer(int idCustomer){
        return services.getCustomer(idCustomer);
    }
    
    
    
    
    
    
    
}
