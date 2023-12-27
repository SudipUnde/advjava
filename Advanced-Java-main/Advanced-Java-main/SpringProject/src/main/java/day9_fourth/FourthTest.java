package day9_fourth;

import org.springframework.stereotype.Component;

@Component
public class FourthTest {

	public FourthTest() {
		System.out.println("Fourth test instantiated");
	}
	public void doTest() {
		System.out.println("Fourth test works.");
	}

}
