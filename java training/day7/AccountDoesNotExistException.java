class AccountDoesNotExistException extends Exception{
	
	public AccountDoesNotExistException(){
	}

	public AccountDoesNotExistException(String message){
		super(message);
	}
}