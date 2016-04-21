/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.presentation.beans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author stephane.grangier
 */
@Named
@SessionScoped
public class DetailAccountBean implements Serializable {

    private Account account;

    /**
     * Creates a new instance of DetailAccount
     */
    public DetailAccountBean() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    

    public String showAccount(Account account) {
        this.account = account;
        return "detailsAccount";
    }

}
