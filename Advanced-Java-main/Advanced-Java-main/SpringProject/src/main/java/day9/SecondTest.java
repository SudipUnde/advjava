package day9;

import org.springframework.stereotype.Component;

@Component
public class SecondTest {

	public SecondTest() {
		System.out.println("Second Test instantiated");
	}
	public void doTest() {
		System.out.println("Second test works...");
	}

}
