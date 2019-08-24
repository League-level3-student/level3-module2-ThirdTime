package WarmUps;

import java.util.ArrayList;

public class ArrayListForLoops {
	public static void main(String[] args) {

		ArrayList<String> greetings = new ArrayList<>(3);
		greetings.add("Hi");
		greetings.add("Hello");
		greetings.add("Howdy");
		
		for(String greeting:greetings) {
			System.out.println(greeting);
		}

	}
}
