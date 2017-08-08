package org.cdk.annotation;

import com.example.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/cdk/annotation/appCtx.xml");
        org.cdk.annotation.Employee employee = (org.cdk.annotation.Employee) context.getBean("employee");

        System.out.println("id : " + employee.getId());
        System.out.println("name : " + employee.getName());
        System.out.println("phone : "  + employee.getPhone());
        System.out.println("address : "  + employee.getAddress().getCity() );

    }
}
