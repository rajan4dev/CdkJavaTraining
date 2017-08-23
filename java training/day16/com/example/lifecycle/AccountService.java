package com.example.lifecycle;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

import javax.annotation.*;

@Component
public class AccountService {

	@PostConstruct
	public void init(){
		System.out.println("DB connection is done!!!!");
	}	

	@PreDestroy
	public void clean(){
		System.out.println("DB connection released!!!!");
	}	

	public void open(){
		System.out.println("Account is opened!!!!");
	}	

	public void close(){
		System.out.println("Account is closed!!!!");
	}	

}