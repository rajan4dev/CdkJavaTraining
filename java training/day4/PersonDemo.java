class PersonDemo{

	public static void main(String[] s){

		System.out.println(Month.MAR);
	
		Month[] arr = Month.values();
		for(Month m : arr){
			System.out.println(m);
		}		

		Person p1 = new Person(1000,"Chintu",Month.JAN);

		System.out.println(p1.uid);
		System.out.println(p1.name);
		System.out.println(p1.month);

	}
}