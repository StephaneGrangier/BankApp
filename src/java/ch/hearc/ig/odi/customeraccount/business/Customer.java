package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

	private Map<String, Account> accounts;  //--converti en Map, VP=> Collection<Account> accounts;
	private int number;
        private String firstName;
	private String lastName;

	/**
	 * 
	 * @param number
	 */
	public Customer(Integer number, String firstName, String lastName) {
            this.number = number;
            this.firstName = firstName;
            this.lastName = lastName;
            this.accounts = new HashMap();
	}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        
        

	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {
            return this.accounts.get(number);
		
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(Account account) {
	
            accounts.put(account.getNumber(), account);
            
	}

}
