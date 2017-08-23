import java.util.*;
import java.util.stream.*;

class ReducerDemo {
		
	public static void main(String[] args){
		userCaseThree();
		userCaseTwo();
		userCaseOne();
	}


	private static void userCaseThree(){

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		
		String result = names.stream()
			//.reduce((acc,name)-> acc +" | "+name).get();
			//.reduce((acc,name)-> acc +","+name).get();
			.reduce("Helllooossss ----- ",(acc,name)-> acc +","+name);
		System.out.println(result);	

	}


	private static void userCaseTwo(){

		List<Integer> numbers = Arrays.asList(20,12,6,8,15,50,5,10);
		int result =  numbers.stream().reduce(5000,(acc,input)-> acc+input);
		System.out.println("Result  : "+result);	

	}


	private static void userCaseOne(){

		List<Integer> numbers = Arrays.asList(20,12,6,8,15,50,5,10);
		int result =  numbers.stream().reduce((a,b)-> a+b).get();
		System.out.println("Result  : "+result);	
		//Optional<Integer> result =  numbers.stream().reduce((a,b)-> a+b);
		//System.out.println("Result  : "+result.get());	
	}
}

