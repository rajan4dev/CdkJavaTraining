import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
			
		//IoC Container is started
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("appCxt.xml");
		
			HelloWorld hw = (HelloWorld)container.getBean("hello"); 				
			hw.hello("Jaggu");			
		
			Greeting grt = (Greeting)container.getBean("greeting"); 				
			grt.greet("Jaggu");			

		//IoC Container is stopped
		container.destroy();	

	}
	
}