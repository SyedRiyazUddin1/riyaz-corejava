package com.junit.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

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

//this annotation creates only one instance for all the methods.
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;

	// this method runs before all the other methods.
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}

	@Test
	@DisplayName("mutiply method")
	void testMultiply() {
		// assertEquals(4, mathUtils.multiply(2,2),"should return the right product");
		// assertAll is used to run a bunch of assertions
		assertAll(() -> assertEquals(4, mathUtils.multiply(2, 2)), () -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(0, mathUtils.multiply(0, 2)));
	}

	// this method runs before each method (i.e., creating new MathUtils instance
	// for all the methods).
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up...");
	}

	// test case for add method
	@Test
	@DisplayName("Testing add method") // displays desired test name
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");
	}

	// test for divide method
	@Test
	@Tag("Math") // helps in runnning only selective tests which has a tag,can select in the
					// IDE configuration
	void testDevide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}

	// test for computeCircleRadius method
	@RepeatedTest(3) // replaced @Test, the test will repeat for 3 times
	void testComputeCircleRadius() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}

	@Test
	@Tag("Math") // helps in runnning only selective tests which has a tag, can selective in the
					// IDE configuration
	void testDivide() {
		boolean isServerUp = false;
		assumeTrue(isServerUp); // assumeTrue(); which tells that I am assuming this value to be true. For ex,
								// if the server is down, i am assume true that the server is up!
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}

	// this test will be disabled
	@Test
	@Disabled
	@DisplayName("TTD method, should not run")
	void testDisabled() {
		fail("This test should be disabled");
	}

	// works only on the mentioned OS, running the test on other OS gives result
	// similar to @Disabled
	@Test
	@EnabledOnOs(OS.LINUX)
	void testComputeCircleRadius1() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}

	/*
	 * The below class will group all the similar kind of tests in one test result
	 * using @Nested annotation
	 */
	@Nested
	class AddTest {

		@Test
		@DisplayName("Testing add method for +ve")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1), "The add method should add two numbers");
		}

		@Test
		@DisplayName("Testing add method for -ve")
		void testAddNegative() {
			assertEquals(-2, mathUtils.add(-1, -1), "The add method should add two numbers");
		}
	}

	// apart from the above stuff, Junit also has interfaces named TestInfo and
	// TestReporter which are used to get the info of the text like test name and te
	// tag name, for examp,e

}
