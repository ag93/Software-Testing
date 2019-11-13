package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem5Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class P5 {

	
Problem5Class problem5;
	
	@Before
	public void setup() {
		problem5 = new Problem5Class();
	}
	
	
	
	@FileParameters("src/excelTestCases/Problem5TestCaseTable.csv")
	@Test
	public void test(int testCase, double x, double y, String basicPath) {
		assertEquals(problem5.calcY(x), y, 0.001);	
	}

}

