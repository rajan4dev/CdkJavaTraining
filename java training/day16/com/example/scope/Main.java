package com.example.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
			
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/example/scope/appCxt.xml");
	
		//User 1	
		Employee emp1 = container.getBean("employee",Employee.class); 				
		System.out.println(emp1);

		//User 2	
		Employee emp2 = container.getBean("employee",Employee.class); 				
		System.out.println(emp2);

		//IoC Container is stopped
		container.destroy();	

	}
	
}