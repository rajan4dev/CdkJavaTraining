package com.myorg.bank.accounts;

/**
 * Created by bhirudr on 7/15/2017.
 */
public class AccountService extends Account {

    public AccountService(int branchId, String branchName, String location, int accountNumber, long balance, String accountType) {
        super(branchId, branchName, location, accountNumber, balance, accountType);
    }

    void updateBalance(int incDec) {
       this.balance = balance + incDec;
   }

}

