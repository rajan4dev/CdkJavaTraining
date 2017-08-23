class Person implements Comparable<Person>{

	int uid;
	String name;
	int age;
	
	public Person(int uid,String name,int age){
		this.uid = uid;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person person){
		if(this.uid == person.uid)
			return 0;
		else if(this.uid > person.uid){
			return 1;
		}
		return -1;
	}

	public boolean equals(Object object){
		if(object instanceof Person){
			Person p = (Person)object;
			if(this.uid == p.uid && this.name.equals(p.name) && this.age == p.age ){
				return true;			
			}else{
				return false;
			} 		
		}
		return false;
	}
}