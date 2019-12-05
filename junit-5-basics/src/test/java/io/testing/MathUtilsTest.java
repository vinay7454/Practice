package io.testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("When running MathUtils")
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numebers");
	}

	@Nested
	@DisplayName("add method")
	@Tag("Math")
	class AddTest{
		@Test
		@DisplayName("When adding two positive numbers")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1), "Retuens the right sum");
		}
		
		@Test
		@DisplayName("When adding two negetive numbers")
		void testAddNegative() {
			int expected = -2;
			int actual = mathUtils.add(-1, -1);
			assertEquals(expected, actual, () -> "Should return sum "  + expected + "but returned " + actual);
		}
	}
	
	@Test
	@Tag("Math")
	@DisplayName("multiply method")
	void testMultiply() {
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1))
				);
	}
	
	@Test
	@Tag("Math")
	void testDivide() {
		boolean isServerUp = false;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}
	
	@Test
	@Tag("Circle")
	void testComputeCircleRadius() {
		assertEquals(314.1592653589793, mathUtils.computeCirlceArea(10), "Should return right circle area");
	}
	
	@Test
	@Disabled
	@DisplayName("TDD method should not run")
	void testDisabled() {
		fail("This test should be disabled");
	}
}
