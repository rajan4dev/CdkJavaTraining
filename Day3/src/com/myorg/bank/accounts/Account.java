package com.myorg.bank.accounts;

import com.myorg.bank.branches.BranchService;

/**
 * Created by bhirudr on 7/15/2017.
 */
public class Account extends BranchService {

    public Account(int branchId, String branchName, String location, int accountNumber, long balance, String accountType) {
        super(branchId, branchName, location);
        AccountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    final int AccountNumber;
    protected long balance;
    protected String accountType;
    String branch;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public long getBalance() {
        return balance;
    }

    protected void increaseBalance (int amount) {
        this.balance = this.balance + amount ;
    }

    protected void decreaseBalance (int amount) {
        this.balance = this.balance - amount ;
    }


}
