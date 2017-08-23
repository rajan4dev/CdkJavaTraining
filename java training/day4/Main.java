class Main{

	public static void main(String[] s){

		Cat cat = new Cat();
		Dog dog = new Dog();
			
		AnimalMentor animalMentor = new AnimalMentor();
		animalMentor.train(cat);
		animalMentor.train(dog);

		/*Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.talk();
		cat.walk(20);
		cat.eat();
		cat.drink();

		dog.talk();
		dog.walk(5);
		long rs = dog.sleep();
		System.out.println("Duration(hrs) : "+rs);
		dog.eat();
		dog.drink();*/
	}
}