class PersonDemo{

	public static void main(String[] s) {

		Person p1 = new Person(1000,"Pintu",25);
		Person p2 = new Person(2000,"Raju",20);

		if(p1.equals(p2)){
			System.out.println("They are same");	
		}else{
			System.out.println("They are not same");	
		}
	
		if(p1.compareTo(p2)==0)
			System.out.println("Same");	

		
		PersonAgeComparator ageComparator = new PersonAgeComparator();
		System.out.println(ageComparator.compare(p1,p2));

		PersonNameComparator nameComparator = new PersonNameComparator();
		System.out.println(nameComparator.compare(p1,p2));
	
	}

}