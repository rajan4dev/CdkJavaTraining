interface Calculator{
	
	String title = "Simple Calculator"; 

	void sum(int a,int b);
	void diff(int a,int b);
}

class Math{

	public static void main(String[] s){
		
		System.out.println(Calculator.title);
		
	}
}