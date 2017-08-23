package com.example;

class AccountServiceImpl<T extends Account> implements AccountService<T> {

	public void open(T account){
		System.out.println("Account is opened : "+account);
		account.open(1000);
	}
	
	public void close(T account){
		System.out.println("Account is closed : "+account);
		account.close(1000);
	}

}