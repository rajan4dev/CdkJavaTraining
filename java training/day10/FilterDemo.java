import java.util.*;
import java.util.stream.*;

class FilterDemo {
		
	public static void main(String[] args){
		userCaseFour();
		//userCaseThree();
		//userCaseTwo();
		//userCaseOne();
	}

	private static void userCaseFour(){

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		
		names.stream()
			//.filter((name)-> name.length() > 5)
			//.filter((name)-> name.length() > 8)
			//.filter((name)-> name.endsWith("Don"))
			//.filter((name)-> name.contains("K"))
			.forEach((name)->{System.out.println("Holaa : "+name);});

	}


	private static void userCaseThree(){

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		
		names.stream()
			.filter((name)-> name.startsWith("R"))
			.forEach((name)->{System.out.println("Holaa : "+name);});

	}


	private static void userCaseTwo(){

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		
		Stream<String> stream1 = names.stream();
		Stream<String> stream2 = stream1.filter((name)-> name.startsWith("R"));
		stream2.forEach((name)->{System.out.println("Holaa : "+name);});

	}


	private static void userCaseOne(){

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		
		Stream<String> stream1 = names.stream();
		Stream<String> stream2 = stream1.filter((name)-> { 
			if(name.startsWith("R")){
				return true;
			}else{
				return false;
			}
		});
		
		stream2.forEach((name)->{System.out.println("Holaa : "+name);});

	}
}

