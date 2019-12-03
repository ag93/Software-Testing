package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem1Class;
import JavaSourceFiles.Problem2Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2 {

	Problem2Class mProblem2;
	
	@Before
	public void setUp() {
		mProblem2 = new Problem2Class();
	}
	
	
	@FileParameters("src/excelTestCases/Problem2TestCaseTable.csv")
	@Test
	public void test(int testCaseNo, double distance, double speed, boolean cruiseEngaged, boolean applyBrakes, double brakingFactor, String bpath, String mcdc) {
		mProblem2.autoBraking(distance, speed, cruiseEngaged);
		assertEquals(applyBrakes, mProblem2.isApplyBrakes());
		assertEquals(brakingFactor, mProblem2.getBrakingFactor(), 0.001);
		
	}

}
