package com.example;

class Bank {
	
	public static void main(String[] args){

		Account account= new Account();

		AccountServiceImpl<Account> impl = new AccountServiceImpl();

		impl.open(account);
		impl.close(account);

	}
}