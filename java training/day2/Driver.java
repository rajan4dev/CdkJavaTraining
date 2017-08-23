class Driver{

	public static void main(String[] s){
		
		Car car1 = new Car(1000,"X6","BMW",89000000.00,60);
		Car car2 = new Car(2000,"X1","BMW",4500000.00,80);
	
		Car car3 = new Car();

		//System.out.println(car1.getVin());
		
		System.out.println(car1.getPrice());
		car1.setPrice(2000.00);
		System.out.println(car1.getPrice());



		//System.out.println(car1.vin);
		//System.out.println(car2.vin);
		
		car1.start();
		car2.start();

		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		System.out.println(car1.speed);

		car1.brake();
		car1.brake();
		System.out.println(car1.speed);
		
		car1.stop();

		car2.accelerate();
		car2.accelerate();
		System.out.println(car2.speed);

		car1.display();
		car2.display();
		car3.display();
	}
}