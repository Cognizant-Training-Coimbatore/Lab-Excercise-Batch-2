import static org.junit.Assert.*;

import org.junit.Test;

public class myProgramTest {

	@Test
	public void testConverttoUpper() {
		myProgram obj = new myProgram();
		String str1 = "India";
		String expOutput ="INDIA";
		String actualOutput = obj.converttoUpper(str1);
		assertEquals(expOutput, actualOutput);
		//testcase
		String str2 ="Selenium";
		int expLength = 8;
		int actLength = obj.findLength(str2);
		assertEquals(expLength,actLength);
	}

}
