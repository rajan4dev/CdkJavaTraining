class Chair extends Furniture{

	String material;
	int legs;
	int hands;

	Chair(){
		System.out.println("Inside Chair() constructor!!!!");
		this.material = "Wood";
	}

	Chair(int id,String material,double price,int legs,int hands){
		super(id,material,price);
		System.out.println("Inside Chair(int id,String material,double price,int legs,int hands) constructor!!!!");
		this.id = id;
		this.legs = legs;
		this.hands = hands;
	}

	void sell(){
		System.out.println("Chair is sold to Obama in $8 million!!!");
	}

	void display(){
		super.display();
		System.out.println("Legs : "+this.legs);
		System.out.println("Hands : "+this.hands);
	}
}