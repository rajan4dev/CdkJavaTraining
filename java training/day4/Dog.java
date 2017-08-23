class Dog extends Animal implements Speakable,Walkable,Sleepable{

	public void talk(){
		System.out.println("Dog saying bhow bhow");
	}

	public void walk(int mile){
		System.out.println("Dog can walk "+mile+ " miles per day");
	}

	public long sleep(){
		System.out.println("Dog is sleeping for 2 hours");
		return 2L; //hours
	}

	public void drink(){
		System.out.println("Dog can drink 10 litre water in a time");
	}

}