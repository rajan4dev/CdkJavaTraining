import java.util.Arrays;
import java.util.List;

public class PStreamDemo {

	public static void main(String s[]) {
		new PStreamDemo ();
	}

	public PStreamDemo () {
		oneDemo();
		System.out.println("====================");
		oneMoreDemo();
	}

	private void oneDemo() {
		List<Integer> list = Arrays.asList(11, 20, 3, 4, 57, 26, 7, 8, 19);
		System.out.println(list);
		list.stream().forEach( (val) -> System.out.println(val) );
	}

	private void oneMoreDemo() {
		List<Integer> list = Arrays.asList(11, 20, 3, 4, 57, 26, 7, 8, 19);
		list.parallelStream().forEach( (val) -> System.out.println(val) );
	}

}
