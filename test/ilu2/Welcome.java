package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (input == null || input.trim().length() == 0) {
			return "Hello, my friend";
		}
		return "Hello,Bob";
	}

}
