package a;

class Showroom{

	public static void main(String[] s){

		Chair chair = new Chair();
		chair.make();
		chair.sell();

		Furniture f = new Furniture();
		f.make();
		f.sell();
	} 

}