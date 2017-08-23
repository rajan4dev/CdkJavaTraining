class Painter {
		
	public static void main(String[] args){
		Circle circle = new Circle();
		ShapeCreater.create(circle);	

		
		Drawable triangle = new Drawable(){
			public void draw(){
				System.out.println("Triangle is drawn!!!");
			}
		};	
	
		ShapeCreater.create(triangle);


		ShapeCreater.create(new Drawable(){
			public void draw(){
				System.out.println("Oval is drawn!!!");
			}
		});

	}
	
}