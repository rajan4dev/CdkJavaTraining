class SecurityService{
	
	public static boolean checkPermission(String user){
		//20 loc to check in DB
		if(user.equals("admin")) {
			return true; //allowed
		}else{
			return false; //denied
		}
	}

	public static boolean userExists(String user){
		//20 loc to check in DB
		if(user.equals("admin")) {
			return true; //exists
		}else{
			return false; //not exists
		}
	}
}