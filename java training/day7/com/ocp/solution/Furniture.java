package com.ocp.solution;

abstract class Furniture {

	int height;
	int width;
	int percentage;

	public Furniture(int height,int width,int percentage){
		this.height = height;
		this.width = width;
		this.percentage = percentage;
	}
	
	public abstract double calculate();
}