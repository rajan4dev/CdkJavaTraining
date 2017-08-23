class AutoBoxingDemo {

	public static void main(String[] args){

		int i = 10;

		//Explicit boxing
		Integer it = new Integer(i);

		//Explicit unboxing
		int y = it.intValue();

		//Auto boxing
		Integer x = i;

		//Auto unboxing
		int z = x;

	}
}