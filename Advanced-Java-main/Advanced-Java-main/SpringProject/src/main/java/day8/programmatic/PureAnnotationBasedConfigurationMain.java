package day8.programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringConfig> configurationUnit = SpringConfig.class;
		AnnotationConfigApplicationContext annoCtx =
				new AnnotationConfigApplicationContext(configurationUnit);
		//The above statement handles the activities for registration as well as refreshing the context.
		//Therefore there is no need to invoke 'register()' and 'refresh()' methods separately.
		
		Class<Test> testRef = Test.class;
		Test testObj = annoCtx.getBean(testRef);
		testObj.doTest();

	}

}
