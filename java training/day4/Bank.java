abstract class AccountService{

	abstract void open();

	void close(){
		System.out.println("Account closed!!");
	}
}

class SavingAccountService extends AccountService{

	void open(){
		System.out.println("Saving account opened with Rs 10 balance!!");
	}
}

class CurrentAccountService extends AccountService{

	void open(){
		System.out.println("Current account opened with Rs 100 balance!!");
	}
}

class FixedDepositAccountService extends AccountService{

	void open(){
		System.out.println("FixedDeposit account opened with $9999990000 balance!!");
	}
}

class Bank{

	public static void main(String[] args){

		


		/*AccountService accountService = new SavingAccountService();
		accountService.open();
		accountService.close();
		accountService = new CurrentAccountService();
		accountService.open();
		accountService.close();
		accountService = new FixedDepositAccountService();
		accountService.open();
		accountService.close();*/

		//SavingAccountService account1 = new SavingAccountService();
	
		AccountService account1 = new SavingAccountService();
		AccountService account2 = new CurrentAccountService();
		AccountService account3 = new FixedDepositAccountService();
		
		System.out.println(account1 instanceof SavingAccountService);
		System.out.println(account2 instanceof CurrentAccountService);


		/*AccountManager accountManager = new AccountManager();
	
		accountManager.openAccount(account1); 
		accountManager.openAccount(account2); 
		accountManager.openAccount(account3); 
		accountManager.openAccount(new FixedDepositAccountService()); 

		accountManager.closeAccount(account1); 
		accountManager.closeAccount(account2); 
		accountManager.closeAccount(account3); */

	}

}



