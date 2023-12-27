package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLoadingMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");		
		//ctx.getBean("myBean3"); When this line executes, Spring instantiates the bean because it's behaviour is LAZY.

	}

}
