/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.presentation.beans;

import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author stephane.grangier
 */
@Named
@SessionScoped
public class CustomerCreateBean implements Serializable {

    @Inject
    Services services;
    private Integer numero = null;
    private String firstName = null;
    private String lastName = null;

    /**
     * Creates a new instance of CustomerCreateBean
     */
    public CustomerCreateBean() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public String save() {
        services.saveCustomer(numero, firstName, lastName);
        return "success";
    }

public void reset(){
        this.numero = null;
        this.firstName = null;
        this.lastName = null;
    }
            
}
