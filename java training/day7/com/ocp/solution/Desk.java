package com.ocp.solution;

class Desk extends Furniture {

	public Desk(int height,int width,int percentage){
		super(height,width,percentage);
	}

	public double calculate(){
		return this.width*this.height*this.percentage;			
	}
}