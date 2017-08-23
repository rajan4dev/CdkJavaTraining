import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo {

	public static void main(String[] args) {
		new CollectorDemo();
	}

	public CollectorDemo() {
		/*demoSix();
		demoFive();
		demoFour();
		demoThree();
		demoTwo();*/
		demoOne();
	}

	private void demoSix() {

		List<Integer> integers = Arrays.asList(23,23,2,90,78,23,6,8,2,45,32,78,56,432,34,11,45,1);
		int result = integers.stream().map((val) -> val*val ).distinct().collect(Collectors.summingInt((val)-> val));
		System.out.println(result);
		System.out.println("======================================");
	}

	private void demoFive() {

		List<Integer> integers = Arrays.asList(23,23,2,90,78,23,6,8,2,45,32,78,56,432,34,11,45,1);
		int result = integers.stream().map((val) -> val+10 ).collect(Collectors.summingInt((val)-> val));
		System.out.println(result);
		System.out.println("======================================");
	}

	private void demoFour() {

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		long result = names.stream().collect(Collectors.counting());
		System.out.println(result);
		System.out.println("======================================");
	}

	private void demoThree() {

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		List<String> result = names.stream().filter((name) -> name.length()>6 ).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("======================================");
	}

	private void demoTwo() {

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		List<String> result =  names.stream().map((name)-> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("======================================");
	}

	
	private void demoOne() {

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		List<String> result =  names.stream().map((name)-> "Name : "+name).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("======================================");
		
	}
	
	public void show(String arg){
		System.out.printf("Filtered Name : %s%n",arg);
	}
}
