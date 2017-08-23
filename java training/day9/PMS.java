class PMS {
		
	public static void main(String[] args){

		String[] names = new String[] {"Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja"};

		PeopleService service = new PeopleService(names);
	
		service.kill((String name) -> { System.out.printf("Pls shoot me : %s%n",name); });

	}
	
}