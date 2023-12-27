package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSimpleExampleMain {
	
	//This example illustrates the use of ClassPathXmlApplicationContext
	public static void main(String[] args) {
		
		String configPath = "spring-config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		
		//Obtaining the object (bean) against its ID
		Object obj = ctx.getBean("myBean3");
		UserService us	= (UserService)obj;
	    String reply  = us.sayGreeting();
	    System.out.println(reply);
	    
		 obj = ctx.getBean("myBean4");
		 us	= (UserService)obj;
	     reply  = us.sayGreeting();
	    System.out.println(reply);
	    
	    obj = ctx.getBean("myBean5");
		 us	= (UserService)obj;
	     reply  = us.sayGreeting();
	    System.out.println(reply);

	    
	    
	}

}
