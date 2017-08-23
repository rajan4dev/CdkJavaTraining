class Furniture{

	int id;
	String material;
	double price;	

	Furniture(){
		System.out.println("Inside Furniture() constructor!!!!");
	}

	Furniture(int id,String material,double price){
		System.out.println("Inside Furniture(int id,String material,double price) constructor!!!!");
		this.id = id;
		this.material = material;
		this.price = price;
	}

	void sell(){
		System.out.println("Furniture is sold to Obama in $4 million!!!");
	}

	void display(){
		System.out.println("ID : "+this.id);
		System.out.println("Material : "+this.material);
		System.out.println("Price : "+this.price);
	}
}