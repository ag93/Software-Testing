package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem1Class;

@RunWith(JUnitParamsRunner.class)
public class P1 {

	Problem1Class problem1;
	
	@Before
	public void setUp () {
		problem1 = new Problem1Class();
	}
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem1ClassTest () {
		// Parameters are as follows:
		//1) batteryPower, 2) red light, 3) yellow light, 4) green light, 5) bell, 6) siren
		return $(
				// Test Case 1
				$(0.0, false, false, false, false, true),
				// Test Case 2
				$(49.9,	false, false, false, true, false),
				// Test Case 3
				$(75.0,	true, false, false, false, false),
				// Test Case 4
				$(124.9, true, true, false, false, false),
				// Test Case 5
				$(250.0, false, true, false, false, false),
				// Test Case 6
				$(250.1, false, false, true, false, false),
				// Test Case 7
				$(0.1, false, false, false, true, false),
				// Test Case 8
				$(50.0, true, false, false, false, false),
				// Test Case 9
				$(75.1, true, true, false, false, false),
				// Test Case 10
				$(125.0, false, true, false, false, false),
				// Test Case 11
				$(1000.0, false, false, true, false, false)
		);
	}
	
	@Test
	@Parameters(method="parametersForProblem1ClassTest")
	public void test(double batteryPower, boolean red, boolean yellow, boolean green, boolean bell, boolean siren) {
		problem1.calcLights(batteryPower);
		assertEquals(red, problem1.isRedLight());
		assertEquals(yellow, problem1.isYellowLight());
		assertEquals(green, problem1.isGreenLight());
		assertEquals(bell, problem1.isBell());
		assertEquals(siren, problem1.isSiren());
	}

}

