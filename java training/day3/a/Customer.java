package a;

class Customer{

	public static void main(String[] s){
			
		AccountService accountService = new AccountService();
		
		accountService.balance();
		accountService.withdraw();
	
		System.out.println(accountService.type);
	} 

}