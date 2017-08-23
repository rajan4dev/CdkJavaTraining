class Car{
	
	private int vin;
	String model;
	String make;
	private double price;
	int speed;

	Car(){
		System.out.println("Inside Car()");
		this.vin = 1;
		this.model = "Q7";
		this.make = "Audi";
		this.price =990000000.00;
		this.speed = 140;
	}
	
	Car(int vin,String model,String make,double price,int speed){
		System.out.println("Inside Car(int vin,String model,String make,double price,int speed)");
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
		this.speed = speed;
	}

	int getVin(){
		return this.vin;
	}

	/*void setVin(int vin){
		this.vin = vin;
	}*/
			
	String getModel(){
		return this.model;
	}

	void setModel(String model){
		this.model = model;
	}


	double getPrice(){
		return this.price;
	}

	void setPrice(double price){
		if(price < 10000.00){
			throw new RuntimeException("Car Price ccan not be less then 10000.00");	
		}
		this.price = price;
	}


	void display(){
		System.out.println("VIN : "+this.vin);
		System.out.println("Model : "+this.model);
		System.out.println("Make : "+this.make);
		System.out.println("Price : "+this.price);
		System.out.println("Speed : "+this.speed);
		System.out.println("=====================");
	}


	void accelerate(){
		this.speed += 10;
	}

	void brake(){
		this.speed -= 10;
	}
	
	void start(){
		System.out.println("Car started!!!!");
	}

	void stop(){
		System.out.println("Car stop!!!!");
	}
}