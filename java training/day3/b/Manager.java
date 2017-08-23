package b;

import a.AccountService;

class Manager{

	public static void main(String[] s){
			
		AccountService accountService = new AccountService();
		
		accountService.balance();
		
		System.out.println(accountService.type);
	} 

}