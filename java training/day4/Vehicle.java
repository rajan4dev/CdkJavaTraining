class Automobile{

	String name;

	public void start(){
		System.out.println("Automobile started!!!");
	}

	public void stop(){
		System.out.println("Automobile stopped!!!");
	}
}

class Car extends Automobile{

	public void stop(){
		System.out.println("Car stopped!!!");
	}

	public void sell(){
		System.out.println("Car sold!!!");
	}
}

class Bus extends Automobile{

	public void buy(){
		System.out.println("Bus purchased!!!");
	}
}

class Vehicle{

	public static void main(String[] args){

		Automobile auto = new Automobile();
		auto.start();
		auto.stop();

		Car car = new Car();
		car.start();
		car.stop();
		car.sell();

		Bus bus = new Bus();
		bus.start();
		bus.stop();
		bus.buy();
	
		Automobile automobile = new Car();
		automobile.start();
		automobile.stop();
		System.out.println(automobile instanceof Car);


		Car bmw = (Car)automobile;
		bmw.start();
		bmw.stop();
		bmw.sell();
		System.out.println(bmw instanceof Car);

	}
	
}



