class DataPresenter<V,T> {

	V value;
	V some;
	int v;
	char ch;
	
	public void show(String data){
		System.out.println(data);
	}
	
	public <T> void display(T data){
		System.out.println(data);
	}

	public <T,E> void info(T data,E count){
		System.out.println(data);
		System.out.println(count);
	}

	public <T,E> void info(T data,E count,T meta){
		System.out.println(data);
		System.out.println(count);
		System.out.println(meta);
	}

	public <V> void greet(V name,T city){
		System.out.println(name);
		System.out.println(city);
	}


}