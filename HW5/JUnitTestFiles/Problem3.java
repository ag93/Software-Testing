package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem3Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class Problem3 {

	
	Problem3Class mProblem;
	
	@Before()
	public void setUp() {
		mProblem = new Problem3Class();
	}
	
	
	
	@FileParameters("src/excelTestCases/Problem3TestCaseTable.csv")
	@Test
	public void test(int testCaseNumber, int month, int day, int year, int result, String bPath) {
		int actual = mProblem.calcPrevDayNum(month, day, year);
		assertEquals(result, actual);
	}

}
