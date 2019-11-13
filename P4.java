package testing;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem4Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class P4 {
	Problem4Class problem4;
	
	@Before
	public void setup() {
		problem4 = new Problem4Class();
	}
	
	
	
	@FileParameters("src/excelTestCases/Problem4TestCaseTable.csv")
	@Test
	public void test(int testCase, boolean landing, double speed, double altitude, Problem4Class.landing output, String basicPath, String mcdc) {
		problem4.landCraft(landing, altitude, speed);
		assertEquals(output, problem4.getAction());		
	}
}

