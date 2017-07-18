package com.myorg.bank.client;

import com.myorg.bank.customers.CustomerService;

/**
 * Created by bhirudr on 7/15/2017.
 */
public class Main{
    public Main() {
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(01, "Pimpri Chinchwad", "Pimpri", 771423, 100000, "Savings", "Rajan Bhirud", 7463738, "Kalyani Nagar", 735078);
        System.out.println(" Your Current Balance : " + customerService.getBalance());

        customerService.depositMoney(20000);
        System.out.println("After deposite , Your Current Balance : " + customerService.getBalance());
        customerService.withdrawMoney(20000);
        System.out.println("After withdrawal, Your Current Balance : " + customerService.getBalance());


    }
}
