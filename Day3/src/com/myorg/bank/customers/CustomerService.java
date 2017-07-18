package com.myorg.bank.customers;

import com.myorg.bank.accounts.Account;
import com.myorg.bank.accounts.AccountService;

/**
 * Created by bhirudr on 7/15/2017.
 */
public class CustomerService extends Account {

    public CustomerService(int branchId, String branchName, String location, int accountNumber, long balance, String accountType, String name, int customerPan, String address, int phoneNo) {
        super(branchId, branchName, location, accountNumber, balance, accountType);
        this.name = name;
        this.customerPan = customerPan;
        Address = address;
        this.phoneNo = phoneNo;
    }

    String name;
    int customerPan;
    String Address;
    int phoneNo;

     public void depositMoney(int amount) {
        this.increaseBalance(amount);
    }

    public void withdrawMoney(int amount) {
        this.decreaseBalance(amount);
    }

}
