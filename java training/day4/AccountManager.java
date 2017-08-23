class AccountManager{

	void openAccount(AccountService accountService){
		accountService.open();
	}

	void closeAccount(AccountService accountService){
		accountService.close();
	}
}



