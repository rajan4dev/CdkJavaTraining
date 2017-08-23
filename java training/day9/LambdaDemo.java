import java.util.function.*;

class LambdaDemo {
		
	public static void main(String[] args){

		//lambda expr syntax
		//(parameters) -> {body}		

		Consumer consumer1 = new Consumer(){
			public void accept(Object obj){
				System.out.println(obj);
			}
		};

		consumer1.accept("Holaaaaaaa"); 

		Consumer consumer2 = (Object name) -> {
			System.out.printf("Good Morning %s%n",name);
		};

		consumer2.accept("Holaaaaaaa"); 

		/*(String name) -> {
			System.out.printf("Good Morning %s%n",name);
		};*/

		Consumer<Integer> consumer3 = (Integer val) -> {
			System.out.printf("Value is : %s%n",val);

		};

		consumer3.accept(40);

		BiConsumer<Integer,String> consumer4 = (Integer val1,String val2) -> {
			System.out.printf("Value : %s and Value : %s%n",val1,val2);
		};


		consumer4.accept(10,"Laptop"); 

		DoubleConsumer consumer5 = (double val) -> {
			System.out.printf("Value is : %s%n",val);

		};

		consumer5.accept(5000.00);

		Function<Integer,Double> function1 = (Integer val1) -> {
			System.out.printf("Function is working.......%n");
			return val1/10.00;
		};

		double rs= function1.apply(100000);
		System.out.printf("Result : %s%n",rs);


		Supplier<Double> function2 = () -> {
			System.out.printf("Supplier is producing values.....%n");
			return 120+40-30/20.00*40.00;
		};

		rs = function2.get();
		System.out.printf("Result : %s%n",rs);

		Predicate<Integer> function3 = (Integer age) -> {
			if(age > 20)
				return true;
			else
				return false;
		};

		boolean result = function3.test(12);
		System.out.println(result);

	}


	public void greet(String name){
		System.out.printf("Good Morning %s%n",name);
	}

}