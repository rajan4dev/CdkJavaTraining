class CastingDemo{

	public static void main(String[] s){

		char ch = 'y';
		System.out.println(ch);
		int i = ch;	
		System.out.println(i);
		
		double d = 120000.0000;

		long a = (long)d;
		int b = (int)a;

		System.out.println(d);
		System.out.println(a);
		System.out.println(b);

	}
}