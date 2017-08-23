import java.util.*;

class PersonAgeComparator implements Comparator<Person>{

	public int compare(Person person1,Person person2){
		if(person1.age == person2.age)
			return 0;
		else if(person1.age > person2.age){
			return -1;
		}
		return 1;
	}

}