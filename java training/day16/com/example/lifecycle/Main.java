package com.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
			
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/example/lifecycle/appCxt.xml");
	
		AccountService accountService  = container.getBean("accountService",AccountService.class); 				

		accountService.open();
		accountService.close();

		//IoC Container is stopped
		container.destroy();	

	}
	
}