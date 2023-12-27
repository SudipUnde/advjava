package day8.programmatic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import day7.GreetingService;
import day7.HelloService;
import day7.WelcomeService;
import day8.UserGreetingService;
import day8.UserService;

@Configuration //Marks this class as a Configuration Unit
@ComponentScan //Scans the classes annotated with '@Component'
public class SpringConfig {
	@Bean //Marks this method as a bean declaration or registration method
	public GreetingService helloBean() {
		GreetingService service = new HelloService();//<bean class="day7.HelloService id="helloBean">
		return service;
	}
	@Bean
	public GreetingService welcomeBean() {
		GreetingService service = new WelcomeService();//<bean class="day7.WelcomeService" id="welcomeBean">
		return service;
	}
	@Bean("myUserBean") //Registers a bean of type UserService against an ID: myUserBean
	public GreetingService userBean() {
		GreetingService service = new UserService();
		return service;
	}
	
	@Bean("greetingBean")
	@Scope("prototype")//<bean scope="prototype">
	@Lazy//<bean lazy-init="true">
	public GreetingService userGreetingBean() {
		GreetingService service = new UserGreetingService("Welcome", 45, "Jack");
		return service;
	}
	

}
