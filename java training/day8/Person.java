import java.io.Serializable;

class Person implements Serializable{

	
	int uid;
	String name;
	int age;
	String phone;
	String email;
	
	public Person(int uid,String name,int age,String phone){
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.phone = phone;

	}

}