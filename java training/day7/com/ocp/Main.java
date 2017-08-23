package com.ocp;

class Main{

	public static void main(String[] args){
		PriceCalculator priceCalculator = new PriceCalculator();
		double price = priceCalculator.calculateChair();	
		System.out.printf("Chair Price : %s%n",price);
		price = priceCalculator.calculateDesk();	
		System.out.printf("Desk Price : %s%n",price);
	}
}