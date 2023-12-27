package day9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAutoWiringMain {

	public static void main(String[] args) {
		Class<SpringAutoWireConfig> configClass = SpringAutoWireConfig.class;
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(configClass);
		
		Object carObj = annoCtx.getBean("myCar");
		System.out.println(carObj);
		
		
		

	}

}
