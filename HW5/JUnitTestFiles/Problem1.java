package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem1Class;
import junitparams.JUnitParamsRunner;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1 {

	Problem1Class mProblem1;
	
	
	@Before()
	public void setUp() {
		mProblem1 = new Problem1Class();
	}
	
	@FileParameters("src/excelTestCases/Problem1TestCaseTable.csv")
	@Test
	public void test(int testCaseNumber, double cart, boolean coupon, int memberPoints, int items, boolean member, double taxRate, double expectedOutput, String bpath, String mcdc) {
		double actual = mProblem1.determineTotal(cart, member, items, coupon, memberPoints, taxRate);
		assertEquals(expectedOutput, actual, 0.006);
		
	}

}
