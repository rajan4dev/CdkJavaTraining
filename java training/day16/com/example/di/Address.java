package com.example.di;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class Address{
	
	@Value("Pune")
	String city;

	public String getCity(){
		return this.city;
	}

	public void setCity(String city){
		this.city = city;
	}
}