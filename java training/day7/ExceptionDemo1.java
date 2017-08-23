class ExceptionDemo1 {
		
	public static void main(String[] args){

		try {
			//String str = null;
			//str.toUpperCase();			

			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);

			System.out.println("11111111111");
			int rs = i/j;
			System.out.println("22222222222");
			System.out.println(rs);
			System.out.println("Done");
		}catch(ArithmeticException e){
			System.out.println("Can not divide by zero");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(NullPointerException e){
			System.out.println("Can not use null reference");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Can not access index coz it is out of range");
		}catch(NumberFormatException e){
			System.out.println("Can not convert string to number");
		}finally{
			System.out.println("Missile launched to Pakistan!!!!");
		}
	}
}