package com.ocp.solution;

class PriceCalculator {

	public double calculate(Furniture furniture){
		return furniture.calculate(); 
	}	

	public double total(Furniture[] furnitures){
		double total = 0.0;
		for(Furniture furniture : furnitures){
			total = total + furniture.calculate(); 
		}
		return total;
	}	
	

}