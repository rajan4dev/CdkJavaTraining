import java.util.*;

class ArrayListDemo6{

	public static void main(String[] s) {
	
		List<Person> persons = new ArrayList<>(4);

		persons.add(new Person(4000,"Jaggu",21)); 
		persons.add(new Person(1000,"Pintu",25)); 
		persons.add(new Person(3000,"Raj",27)); 
		persons.add(new Person(2000,"Raju",20)); 
		
		Iterator<Person> itr  = persons.iterator();
		
		while(itr.hasNext()){
			Person person = itr.next();
			System.out.println(person.uid+" : "+person.name+" : "+person.age);	
		}

		System.out.println("====================");	

		Collections.sort(persons);

		itr  = persons.iterator();
		
		while(itr.hasNext()){
			Person person = itr.next();
			System.out.println(person.uid+" : "+person.name+" : "+person.age);	
		}


		System.out.println("====================");	

		PersonAgeComparator ageComparator = new PersonAgeComparator();

		Collections.sort(persons,ageComparator);

		itr  = persons.iterator();
		
		while(itr.hasNext()){
			Person person = itr.next();
			System.out.println(person.uid+" : "+person.name+" : "+person.age);	
		}
			

	}

}