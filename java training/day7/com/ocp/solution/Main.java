package com.ocp.solution;

class Main{

	public static void main(String[] args){
		Chair chair = new Chair(10,4,5);
		Desk desk = new Desk(10,4,20);
		Almirah almirah = new Almirah(50,10,4,20);

		
		PriceCalculator priceCalculator = new PriceCalculator();
		double price = priceCalculator.calculate(chair);	
		System.out.printf("Chair Price : %s%n",price);
		price = priceCalculator.calculate(desk);	
		System.out.printf("Desk Price : %s%n",price);
		price = priceCalculator.calculate(almirah);	
		System.out.printf("Almirah  Price : %s%n",price);

		Chair chair1 = new Chair(10,4,5);
		Chair chair2 = new Chair(15,7,5);
		Chair chair3 = new Chair(18,9,5);
		
		Chair[] chairs = new Chair[]{chair1,chair2,chair3};
		price = priceCalculator.total(chairs);	
		System.out.printf("Chair Total Price : %s%n",price);
					
	

	}
}