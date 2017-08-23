class Circle{

	int radius;
	final static double PI = 3.14;	
	
	Circle(int radius){
		this.radius = radius;
	}

	void area(){
		System.out.println("Area : "+(this.radius*this.radius*this.PI));
	}

	public static void main(String[] s){

		Circle c1 = new Circle(20);
		c1.area();
	}

}