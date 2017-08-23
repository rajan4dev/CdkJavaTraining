class ArrayDemo{

	public static void main(String[] s){
		
		//array declaration
		//int marks[];
		
		//array initialization
		//marks = new int[5]; 
		
		//array declaration & initialization	
		//int marks[] = new int[8]; 
		
		//array assignment
		//marks[0] = 900;
		//marks[2] = 400;

		//array declaration & initialization & assignment	
		int marks[] = new int[]{23,45,22,44,233,232,32,323};				

		System.out.println(marks[0]);
		System.out.println(marks[2]);

		for(int idx = 0; idx < marks.length; idx++){
			System.out.println(marks[idx]);
		}

	
		for(int val : marks){
			System.out.println(val);
		}

		System.out.println(marks.length);

		System.out.println("Done");

	}	

}