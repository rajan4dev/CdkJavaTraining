class Cat extends Animal implements Speakable,Walkable{

	public void talk(){
		System.out.println("Cat saying meow meow");
	}

	public void walk(int mile){
		System.out.println("Cat can walk "+mile+ " miles per day");
	}

	public void drink(){
		System.out.println("Cat can drink 10 litre milk in a time");
	}
}