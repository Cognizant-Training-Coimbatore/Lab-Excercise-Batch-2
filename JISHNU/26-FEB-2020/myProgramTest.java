import static org.junit.Assert.*;

import org.junit.Test;

public class myProgramTest {

	@Test
	public void testConvertertoUpper() {
		myProgram obj=new myProgram();
		String strl="India";
		String expOutput="INDIA";
		String actOutput=obj.convertertoUpper(strl);
		assertEquals(expOutput, actOutput);
		String str2="Selenium";
		int explength=8;
		int actlength=obj.findLength(str2);
		assertEquals(explength, actlength);
	}

}
