package ToDo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAndConstructorInjectionMain {

	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("-------------------Setter Injection------------------");
		Object obj =  cntx.getBean("myBean1");
		CourseInterface courseInter= (CourseInterface)obj;
		String result =  courseInter.CourseInfo();
		System.out.println(result);
		
		System.out.println("-------------------Constructor Injection------------------");
		 obj =  cntx.getBean("myBean2");
		 courseInter= (CourseInterface)obj;
		 result =  courseInter.CourseInfo();
		System.out.println(result);
		
		 obj =  cntx.getBean("myBean3");
		 courseInter= (CourseInterface)obj;
		 result =  courseInter.CourseInfo();
		System.out.println(result);
		
	}

}
