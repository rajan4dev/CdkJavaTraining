class Owner{
	
	String name;
	private int electricity = 70; //kw
	static final private String lobby = "12x8";  //SQMT

	Owner(String name){
		this.name = name;
	}	

	void show(){
		System.out.println("Owner Name : "+this.name);
		System.out.println("Owner Elctricity(KW) : "+this.electricity);
		System.out.println("Owner Lobby Area(SQMT) : "+this.lobby);
		Tenant t = new Tenant("Raju",10);
		System.out.println("Tetant carrying : "+t.bags+" bags!!!");
	}

	class Tenant {
		String name;
		private int bags;		

		Tenant(String name,int bags){
			this.name = name;
			this.bags = bags;
		}	

		void info(){
			System.out.println("Tenant Name : "+this.name);
			System.out.println("Bags : "+this.bags);
		}

		void usePower(){
			System.out.println("Tenant using : "+(electricity*0.20)+" % load!!!!");
		}
				
		void useLobby(){
			System.out.println("Tenant using : "+lobby+" area!!!!");
		}
	}	
}

