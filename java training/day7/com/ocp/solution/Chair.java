package com.ocp.solution;

class Chair extends Furniture {

	public Chair(int height,int width,int percentage){
		super(height,width,percentage);
	}

	public double calculate(){
		return this.width+this.height*this.percentage;			
	}
}