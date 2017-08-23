package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
			
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/example/di/appCxt.xml");
		
		Employee emp = container.getBean("employee",Employee.class); 				
		//System.out.println(emp.getAddress());

		System.out.println(emp.id);
		System.out.println(emp.dob);

		/*System.out.println(emp.getAddresses().size());
		System.out.println(emp.getAddresses().keySet());
		System.out.println(emp.getAddresses().values());*/

		/*System.out.println(emp.getAddresses()[0].getCity());
		System.out.println(emp.getAddresses()[1].getCity());
		System.out.println(emp.getAddresses()[2].getCity());*/
	
		//System.out.println(emp.getHomeAddress().getCity());
		//System.out.println(emp.getOfficeAddress().getCity());

		//IoC Container is stopped
		container.destroy();	

	}
	
}