class Student{
	
	final static int marks = 100;
	String name;
	int hindi;
	int english;

	Student(String name,int hindi,int english){
		this.name = name;
		this.hindi = hindi;
		this.english = english;
	}
	
	void display(){
		System.out.println("NAME : "+this.name);
		System.out.println("HINDI : "+(this.hindi*100.0/this.marks));
		System.out.println("ENGLISH : "+(this.english*100.0/this.marks));
		System.out.println("=====================");
	}
}