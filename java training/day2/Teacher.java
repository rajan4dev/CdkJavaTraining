class Teacher{

	public static void main(String[] s){

		Student s1 = new Student("Jaggu",60,90);
		Student s2 = new Student("Pintu",80,50);

		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println(Student.marks);

		//s1.marks = 500;
		
		System.out.println(s2.marks);
		System.out.println(Student.marks);

		//s1.display();
		//s2.display();
	}
}