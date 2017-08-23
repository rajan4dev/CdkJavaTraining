class PeopleService {
	
	String[] values;

	public PeopleService(String[] values){
		this.values = values;
	}	

	public void kill(Killer killer){
		for(String value : values){
			killer.shoot(value);
		}
	}

}