package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	Welcome welcome;

	@BeforeEach
	void setUp() throws Exception {
		welcome = new Welcome();
	}

	@Test
	void testexigence1() {
		assertEquals("Hello, Bob", welcome.welcome("bob"));
	}

	@Test
	void testexigence2() {
		assertEquals("Hello, my friend", welcome.welcome("  "));
		assertEquals("Hello, my friend", welcome.welcome(null));
		assertEquals("Hello, my friend", welcome.welcome(""));
	}

	@Test
	void testexigence3() {

	}

}
