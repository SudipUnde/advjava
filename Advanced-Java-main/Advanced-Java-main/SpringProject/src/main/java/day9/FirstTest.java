package day9;

import org.springframework.stereotype.Component;

@Component
public class FirstTest {
	
	public FirstTest() {
		System.out.println("First Test instantiated");
	}
	public void doTest() {
		System.out.println("First test works...");
	}

}
