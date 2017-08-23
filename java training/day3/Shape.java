abstract class Shape{
	
	String color;
	String borderColor;

	Shape(){
		this.color = "Black";
		this.borderColor = "White";
	}

	Shape(String color,String borderColor){
		this.color = color;
		this.borderColor = borderColor;
	}

	void info(){
		System.out.println("I am Shape.info() and Shape color is : "+this.color+" and Border color is : "+this.borderColor);
	}
	
	abstract void draw();	
	abstract void paint();	
}

class Square extends Shape{
	
	int length; //cm

	Square(int length, String color,String borderColor){
		super(color,borderColor);
		this.length = length;
	}

	void draw(){
		System.out.println("Square is drawn!!!");
	}
	
	void paint(){
		System.out.println("Square is painted with "+this.color+" brush!!!");
	}
}

class Rectangle extends Shape{

	void draw(){
		System.out.println("Rectangle is drawn!!!");
	}
	
	void paint(){
		System.out.println("Rectangle is painted with pencil!!!");
	}
}

abstract class RoundShape extends Shape{

	void paint(){
		System.out.println("RoundShape is painted with hand!!!");
	}
}

class Circle extends RoundShape{

	void draw(){
		System.out.println("Circle  is drawn!!!");
	}

}


class Oval extends RoundShape{

	void draw(){
		System.out.println("Oval  is drawn!!!");
	}

}



