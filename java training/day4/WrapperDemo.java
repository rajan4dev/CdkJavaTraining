class WrapperDemo{

	public static void main(String[] s){
		
		Double salary  = new Double(600000.00);
		System.out.println(salary);
		double rs = salary.doubleValue();
		System.out.println(rs);

		int i = 1000;
		Integer it = new Integer(i);
		
		System.out.println(i);
		
		System.out.println(it);
		int j = it.intValue();
		System.out.println(j);

	}
}