import static org.junit.Assert.assertEquals;

import org.junit.Test;

class myprogramTest {

	@Test
	void testConvertToUpper() {
		
		myprogram obj= new myprogram();
		String str1="india";
		String expOutput="INDIA";
		String ActOutput=obj.convertToUpper(str1);
		assertEquals(expOutput, ActOutput);
	}

}
