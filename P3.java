package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem3Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class P3 {

	Problem3Class problem3;
	
	@Before
	public void setup() {
		problem3 = new Problem3Class();
	}
	
	
	@FileParameters("src/excelTestCases/Problem3TestCaseTable.csv")
	@Test
	public void test(int testCaseNumber,double distance, boolean cruiseRequested, double speed,boolean redLight, boolean yellowLight,
			boolean greenLight, boolean caution, boolean warning, boolean cruiseEngaged, String basisPath, String mcdc) {
		problem3.setWarnings(cruiseRequested, distance, speed);
		assertEquals(redLight, problem3.isRedLight());
		assertEquals(yellowLight, problem3.isYellowLight());
		assertEquals(greenLight, problem3.isGreenLight());
		assertEquals(caution, problem3.isCaution());
		assertEquals(warning, problem3.isWarning());
		assertEquals(cruiseEngaged, problem3.isCruiseEngaged());
	}

}

