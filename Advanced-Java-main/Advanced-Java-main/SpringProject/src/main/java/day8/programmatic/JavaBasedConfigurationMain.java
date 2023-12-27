package day8.programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day7.GreetingService;

public class JavaBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext();
		
		//Registering the configuration unit: SpringConfig
		Class<SpringConfig> configurationUnit = SpringConfig.class;
		annoCtx.register(configurationUnit);
		
		//Refreshing the context
		annoCtx.refresh();
		
		Object obj = annoCtx.getBean("helloBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = annoCtx.getBean("welcomeBean");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = annoCtx.getBean("myUserBean");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		Object o1 = annoCtx.getBean("greetingBean");
		Object o2 = annoCtx.getBean("greetingBean");
		System.out.println(o1 == o2);
		
		

	}

}
