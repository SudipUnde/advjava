package day9;

import org.springframework.stereotype.Component;

@Component("third")//Configured this Component with an ID: third
public class ThirdTest {

	public ThirdTest() {
		System.out.println("Third Test instantiated");
	}
	public void doTest() {
		System.out.println("Third test works...");
	}

}
