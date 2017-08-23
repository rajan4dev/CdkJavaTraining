package com.example.di;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class Generator{
	
	public int generate(){
		return (int)(Math.random()*500);
	}

}