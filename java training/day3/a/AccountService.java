package a;

public class AccountService{

	public String type = "Saving";	

	public void balance(){
		System.out.println("Account balance : $10 dollars only!!!");
	}

	void withdraw(){
		System.out.println("Balance is less by $5 dollars!!!");
	}
}