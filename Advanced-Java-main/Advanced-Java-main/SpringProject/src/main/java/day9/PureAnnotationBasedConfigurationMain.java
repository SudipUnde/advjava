package day9;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day9_fourth.FourthTest;
import day9_fourth.another.AnotherFourthTest;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		Class<SpringAppConfig> configClass = SpringAppConfig.class;
		AnnotationConfigApplicationContext annoCtx = 
				new AnnotationConfigApplicationContext(configClass);
		
		//Loading a bean of type : FirstTest
			FirstTest firstTest =	annoCtx.getBean(FirstTest.class);
			
		//Loading a bean of type : SecondTest
			SecondTest secondTest = annoCtx.getBean(SecondTest.class);
			
		//Loading a bean of type : SecondTest
			Object obj = annoCtx.getBean("third");
			ThirdTest thirdTest = (ThirdTest)obj;
			
		firstTest.doTest();
		secondTest.doTest();
		thirdTest.doTest();
		
		System.out.println("-------------Accessing FourthTest bean------------------");
		FourthTest fourthTest = annoCtx.getBean(FourthTest.class);
		fourthTest.doTest();
		
		System.out.println("-------------Accessing Another FourthTest bean------------------");
		AnotherFourthTest anotherFourthTest = annoCtx.getBean(AnotherFourthTest.class);
		anotherFourthTest.doTest();
		
		System.out.println("-------------Accessing bean of type java.util.List------------------");
          obj = annoCtx.getBean("countries");
          List<String> countriesList = ( List<String>)obj;
          //countriesList.stream().forEach(ctr -> System.out.println(ctr));
          for(  String FinalCountriesList :countriesList) {
        	  System.out.println(FinalCountriesList);
          }

		
		

	}

}
