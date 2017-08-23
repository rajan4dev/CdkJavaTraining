class Calculator {
		
	public int sum(int a,int b) throws InvalidInputException {
		if(a <= 0 || b <= 0){
			InvalidInputException e = new InvalidInputException("Input value can not be zero or negative!!!");
			throw e;
		}
		return a+b;	
	}

	public int diff(int a,int b) throws InvalidInputException {
		if(a <= 0 || b <= 0){
			throw new InvalidInputException("Input value can not be zero or negative!!!");
		}
		return a-b;	
	}
}