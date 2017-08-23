class AnimalMentor{

	void train(Animal animal){
		animal.eat();
		animal.drink();
		if(animal instanceof Dog){
			Dog dog = (Dog)animal;
			dog.talk();
			dog.walk(40);
			dog.sleep();
		}
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
			cat.talk();
			cat.walk(40);
		}
	}
}