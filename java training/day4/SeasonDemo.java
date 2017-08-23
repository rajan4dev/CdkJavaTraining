enum Season{
	WINTER(1,2),SUMMER(5,6),RAINY(10,11),SPRING(2,3);

	int month1;
	int month2;

	public int getMonth1(){
		return this.month1;
	}
	
	private Season(){
		System.out.println("Inside Season() constructor!!!!!");
	}

	private Season(int m1,int m2){
		System.out.println("Inside Season(int m1,int m2) constructor!!!!!");
		this.month1 = m1;
		this.month2 = m2;
	}
}


class SeasonDemo{

	public static void main(String[] args){
	
		System.out.println(Season.WINTER);
		
		Season[] arr = Season.values();
		for(Season s : arr){
			System.out.println(s);
			System.out.println(s.month1);
			System.out.println(s.month2);
		}
		
	}	
	
}
