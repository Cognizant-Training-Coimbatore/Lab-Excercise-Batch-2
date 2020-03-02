import static org.junit.Assert.*;

import org.junit.Test;

class myclassTest 
{
	@Test
	void testFindLength() 
	{
		myclass ob = new myclass();
		String s ="java";
		int expLength = 4;
		int actLength = ob.findLength(s);
		assertEquals(expLength, actLength);
	}

}
