class Math {
		
	public static void main(String[] args){
		
		Calculator calc = new Calculator();	
		try{
			int rs = calc.sum(10,-10);
			System.out.println("SUM : "+rs);
		}catch(InvalidInputException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}
}