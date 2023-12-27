package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

	public class SpringSimpleExampleMain {

	public static void main(String[] args) {

		//Building ApplicationContext
		String configPath = "./src/main/resources/spring-config.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(configPath);
		
		//Obtaining the object (bean) against its ID
		Object obj = ctx.getBean("myBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = ctx.getBean("myBean2");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		
		

	}

}
