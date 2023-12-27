package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This example illustrates Bean Scope
public class SpringBeanScopeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("----------------Using Singleton-------------");
		Object obj = ctx.getBean("myBean4");
		Object obj2 = ctx.getBean("myBean4");
		Object obj3 = ctx.getBean("myBean4");
		System.out.println(obj == obj2);
		System.out.println(obj == obj3);
		
		System.out.println("--------------------Using Prototype--------------------------------");
		
		obj = ctx.getBean("myBean5");
		obj2 = ctx.getBean("myBean5");
		obj3 = ctx.getBean("myBean5");
		System.out.println(obj == obj2);
		System.out.println(obj == obj3);

	}

}
