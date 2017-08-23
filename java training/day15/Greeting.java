public class Greeting {

	String message;


	public Greeting(){
	}	


	public Greeting(String message){
		this.message = message;
	}	
	
	public void greet(String name){
		System.out.println(message+" "+name);
	}
	
}