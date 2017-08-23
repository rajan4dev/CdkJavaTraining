class Calculator{


	public static void main(String[] s){
		Calculator cal = new Calculator();

		cal.sum(20,5);			
		cal.sum(12,78,34,20,5);			
		cal.sum(20,5,90);			
		cal.sum(20);
			
		/*cal.sum(80.00,5);			
		cal.sum(10,40.00);			
		cal.sum(2,20,5);*/			
	}

	void sum(int val1,int... arr){
		System.out.println("Inside sum(int val1,int... val2)");
		int rs = val1;
		for(int val : arr){
			rs = rs + val;
		}
		System.out.println("Result : "+rs);	
	}

	/*void sum(int val1,int val2){
		System.out.println("Inside sum(int val1,int val2)");
		System.out.println("Result : "+(val1+val2));	
	}

	void sum(int val1,int val2,int val3){
		System.out.println("Inside sum(int val1,int val2,int val3)");
		System.out.println("Result : "+(val1+val2+val3));	
	}

	void sum(double val1,int val2){
		System.out.println("Inside sum(double val1,int val2)");
		System.out.println("Result : "+(val1+val2));	
	}

	void sum(int val1,double val2){
		System.out.println("Inside sum(int val1,double val2)");
		System.out.println("Result : "+(val1+val2));	
	}

	void sum(float val1,int val2){
		System.out.println("Inside sum(float val1,int val2)");
		System.out.println("Result : "+(val1+val2));	
	}*/

}