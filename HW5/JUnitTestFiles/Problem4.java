package testing;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import JavaSourceFiles.Problem4Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4 {

	Problem4Class mProblem;
	Problem4ServerData mProblem4Mock;
	
	@Before()
	public void setUp() {
		mProblem = new Problem4Class();
		mProblem4Mock = EasyMock.strictMock(Problem4ServerData.class);
	}
	
	
	@FileParameters("src/excelTestCases/Problem4TestCaseTable.csv")
	@Test
	public void test(int testCaseNumber, double batteryPower, boolean red, boolean yellow, boolean green, boolean bell, boolean siren, String bpath) {
		EasyMock.expect(mProblem4Mock.getBatteryPower()).andReturn(batteryPower);
		EasyMock.replay(mProblem4Mock);
		mProblem.calcLights(mProblem4Mock);
		assertEquals(red, mProblem.isRedLight());
		assertEquals(yellow, mProblem.isYellowLight());
		assertEquals(green, mProblem.isGreenLight());
		assertEquals(bell, mProblem.isBell());
		assertEquals(siren, mProblem.isSiren());
		
	}

}
