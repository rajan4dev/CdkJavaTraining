class ShapeMaker{
	
	public static void main(String[] s){
	
		Square square = new Square(20,"Yellow","Red");
		square.info();
		square.draw();
		square.paint();
	
		Rectangle rectangle = new Rectangle();
		rectangle.info();
		rectangle.draw();
		rectangle.paint();
	
		Circle circle = new Circle();
		circle.info();
		circle.draw();
		circle.paint();
	
		Oval oval = new Oval();
		oval.info();
		oval.draw();
		oval.paint();
	}

}