package com.ocp;

class PriceCalculator {

	public double calculateChair(){
		Chair chair = new Chair(12,4);
		return (chair.width+chair.height)*5.00;			
	}	

	public double calculateDesk(){
		Desk desk = new Desk(12,5);
		return (desk.width*desk.height)*150.00;			
	}	
}