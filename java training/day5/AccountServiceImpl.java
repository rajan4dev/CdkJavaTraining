class AccountServiceImpl implements AccountService<Account> {

	public void open(Account account){
		account.open(1000);
	}
	
	public void close(Account account){
		account.close(1000);
	}

}