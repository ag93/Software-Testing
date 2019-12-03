package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem5Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5 {

	Problem5Class mProblem5;
	
	
	@Before()
	public void setUp() {
		mProblem5 = new Problem5Class();
	}
	
	@FileParameters("src/excelTestCases/Problem5TestCaseTable.csv")
	@Test
	public void test(int testCaseNumber, double cart, boolean coupon, int memberPoints, int items, boolean member, double taxRate, double expectedOutput, String bpath, String mcdc) {
		double actual = mProblem5.determineTotal(cart, member, items, coupon, memberPoints, taxRate);
		assertEquals(expectedOutput, actual, 0.006);
		
	}

}
