package com.ocp.solution;

class Almirah extends Furniture {

	int length;

	public Almirah(int length,int height,int width,int percentage){
		super(height,width,percentage);
		this.length = length;
	}

	public double calculate(){
		return this.length+this.width*this.height*this.percentage;			
	}
}