class Condition{

	public static void main(String[] s){

		int marks = 105;

		switch(marks){
			
			case 10	:
				System.out.println("Yor are a super failure");
				break;
			case 40	:
				System.out.println("Yor are a failure");
				break;
			case 60	:
				System.out.println("Yor are pass");
				break;
			case 90	:
				System.out.println("Yor are a super pass, give party");
				break;
			default	:
				System.out.println("Result not declared!!!!!");
		}		



		int age =45;
		
		if(age > 30){
			System.out.println("Go and enjoy the movie!!!!");
		}else if(age > 20){
			System.out.println("Enjoy popcorn!!!");
		}else{
			System.out.println("Go Home!!!");
		}

		System.out.println("Done");

	}	

}