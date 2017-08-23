class InsufficiendFundException extends RuntimeException{
	
	public InsufficiendFundException(){
	}

	public InsufficiendFundException(String message){
		super(message);
	}
}