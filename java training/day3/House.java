class House{
	
	public static void main(String[] s){
		
		Owner owner = new Owner("Jaggu");
		owner.show();
	
		Owner.Tenant tenant = owner.new Tenant("Ghanshu",5);
		tenant.info();
		tenant.usePower();
		tenant.useLobby();
		
	}

}